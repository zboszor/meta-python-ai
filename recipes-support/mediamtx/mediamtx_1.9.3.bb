SUMMARY = "Ready-to-use SRT / WebRTC / RTSP / RTMP / LL-HLS media server and media proxy that allows to read, publish, proxy, record and playback video and audio streams."
DESCRIPTION = "${SUMMARY}"
HOMEPAGE = "https://github.com/bluenviron/mediamtx"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=77fd2623bd5398430be5ce60489c2e81"

inherit go-mod systemd

SRC_URI = " \
	git://github.com/bluenviron/mediamtx.git;protocol=https;branch=main \
	file://${GO_IMPORT}.service \
"

SRCREV = "6cd7487857dc6ee8b82cff1f45c900ad7e3d6362"


GO_IMPORT = "mediamtx"
GO_INSTALL = "${GO_IMPORT}"
CGO_ENABLED = "0"
GO_LINKSHARED = ""
GOBUILDFLAGS:remove = "-buildmode=pie"

do_configure:prepend () {
	# Make the source directory available in path expected by go-mod.bbclass
	mkdir -p ${S}/src
	ln -snf ${S} ${S}/src/${GO_IMPORT}
}

do_compile[network] = "1"

do_compile:prepend () {
	go generate ./...
}

do_compile:append () {
	# This is needed to remove read-only files
	go clean -modcache
	rm -rf src/${GO_IMPORT}/pkg/mod
	[[ -d ${B}/pkg ]] && find ${B}/pkg -type d -exec chmod 775 {} \;
	[[ -d ${S}/pkg ]] && find ${S}/pkg -type d -exec chmod 775 {} \;

	# Remove rpicamera
	rm -rf ${S}/internal/staticsources/rpicamera/mtxrpicam_*
}

do_install:append () {
	mkdir -p ${D}${datadir}/${GO_IMPORT}
	install -m644 ${S}/mediamtx.yml ${D}${datadir}/${GO_IMPORT}

	install -d ${D}${systemd_system_unitdir}
	install -m644 ${UNPACKDIR}/mediamtx.service ${D}${systemd_system_unitdir}

	rm -rf ${D}${libdir}/go/src/${GO_IMPORT}
}

SYSTEMD_PACKAGES = "${PN}"
SYSTEMD_SERVICE:${PN} = "${GO_IMPORT}.service"

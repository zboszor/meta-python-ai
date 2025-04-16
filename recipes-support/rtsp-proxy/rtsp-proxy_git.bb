DESCRIPTION = "RTSP proxy for flaky cameras"
HOMEPAGE = "https://github.com/zboszor/rtsp-proxy"
LICENSE = "MIT"

DEPENDS = "ffmpeg iniparser nng"

inherit autotools pkgconfig

PR = "r1"

LIC_FILES_CHKSUM = "file://COPYING;md5=ad3fc5fe29791e832e8c969cd651eb4b"

SRC_URI = "git://github.com/zboszor/rtsp-proxy.git;protocol=https;branch=main"

SRCREV = "4b4006f7ed03d89495194383a83e79ce0cc29efa"

S = "${UNPACKDIR}/git"

PACKAGECONFIG[rtspsrv] = ",,,mediamtx"

do_install:append () {
	install -d ${D}${sysconfdir}
	install -m0644 ${S}/contrib/rtsp-proxy.ini.sample ${D}${sysconfdir}

	install -d ${D}${systemd_system_unitdir}
	if [[ "${@bb.utils.contains('PACKAGECONFIG', 'rtspsrv', '1', '0', d)}" = "1" ]]; then
		install -m0644 ${S}/contrib/rtsp-proxy@.service.sample ${D}${systemd_system_unitdir}/rtsp-proxy@.service
	fi
	install -m0644 ${S}/contrib/rtsp-proxy-nng@.service.sample ${D}${systemd_system_unitdir}/rtsp-proxy-nng@.service
}

FILES:${PN} += "${systemd_system_unitdir}/*.service"

DESCRIPTION = "RTSP proxy for flaky cameras"
HOMEPAGE = "https://github.com/zboszor/rtsp-proxy"
LICENSE = "MIT"

DEPENDS = "ffmpeg iniparser"

inherit autotools pkgconfig

#PR = "r1"

LIC_FILES_CHKSUM = "file://COPYING;md5=ad3fc5fe29791e832e8c969cd651eb4b"

SRC_URI = "git://github.com/zboszor/rtsp-proxy.git;protocol=https;branch=main"

SRCREV = "ed7fe8705c75b961a4c74f1337c0226826539511"

S = "${UNPACKDIR}/git"

do_install:append () {
	install -d ${D}${sysconfdir}
	install -m0644 ${S}/contrib/rtsp-proxy.ini.sample ${D}${sysconfdir}

	install -d ${D}${systemd_system_unitdir}
	install -m0644 ${S}/contrib/rtsp-proxy@.service.sample ${D}${systemd_system_unitdir}/rtsp-proxy@.service
}

FILES:${PN} += "${systemd_system_unitdir}/rtsp-proxy@.service"

RDEPENDS:${PN} = "mediamtx"

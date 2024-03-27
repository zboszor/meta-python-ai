DESCRIPTION = "Adaptive Entropy Coding library"
HOMEPAGE = "https://gitlab.dkrz.de/k202009/libaec"
LICENSE = "BSD-2-Clause"

inherit cmake

#PR = "r1"

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b8d9cca03152fd18210dd81400881e2d"

SRC_URI = "git://gitlab.dkrz.de/k202009/libaec.git;protocol=https;branch=master"

SRCREV = "58677dbbf080bac17bbb8717d32e63feb4e20115"

S = "${WORKDIR}/git"

OECMAKE_GENERATOR = "Unix Makefiles"

EXTRA_OECMAKE = "-DBUILD_TESTING=ON"

do_install:append () {
	mv ${D}${prefix}/cmake ${D}${libdir}/cmake
}

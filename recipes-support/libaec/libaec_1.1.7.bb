DESCRIPTION = "Adaptive Entropy Coding library"
HOMEPAGE = "https://gitlab.dkrz.de/k202009/libaec"
LICENSE = "BSD-2-Clause"

inherit cmake

#PR = "r1"

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=128305912d075b470880a190ed3e8c53"

SRC_URI = "git://gitlab.dkrz.de/dkrz-sw/libaec.git;protocol=https;branch=main"

SRCREV = "0c4c01463d2c64a112a61271d317b74efb660608"

OECMAKE_GENERATOR = "Unix Makefiles"

EXTRA_OECMAKE = "-DBUILD_TESTING=ON"

BBCLASSEXTEND = "native"

DESCRIPTION = "Adaptive Entropy Coding library"
HOMEPAGE = "https://gitlab.dkrz.de/k202009/libaec"
LICENSE = "BSD-2-Clause"

inherit cmake

#PR = "r1"

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=128305912d075b470880a190ed3e8c53"

SRC_URI = "git://gitlab.dkrz.de/k202009/libaec.git;protocol=https;branch=master"

SRCREV = "d84ea9c83097a0806f73fc48b69ae7eb9a94525e"

OECMAKE_GENERATOR = "Unix Makefiles"

EXTRA_OECMAKE = "-DBUILD_TESTING=ON"

BBCLASSEXTEND = "native"

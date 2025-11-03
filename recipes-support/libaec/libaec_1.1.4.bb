DESCRIPTION = "Adaptive Entropy Coding library"
HOMEPAGE = "https://gitlab.dkrz.de/k202009/libaec"
LICENSE = "BSD-2-Clause"

inherit cmake

#PR = "r1"

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=da01d14dfd146abb3fcf65147345c266"

SRC_URI = "git://gitlab.dkrz.de/k202009/libaec.git;protocol=https;branch=master"

SRCREV = "7204505af7d6635734fc12a38d6bd0a6253c9c6d"

OECMAKE_GENERATOR = "Unix Makefiles"

EXTRA_OECMAKE = "-DBUILD_TESTING=ON"

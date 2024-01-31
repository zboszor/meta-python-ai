DESCRIPTION = "Essential Routines for Fundamental Astronomy."
HOMEPAGE = "https://github.com/liberfa/erfa"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cafa2ac4d31669d3e32cecd5a059da6f"

inherit autotools pkgconfig

#PR = "r1"

SRC_URI = "git://github.com/liberfa/erfa.git;protocol=https;branch=master"

SRCREV = "9915ba38c9365f8b0738269b8c2ac1fdd5f8dee3"

S = "${WORKDIR}/git"

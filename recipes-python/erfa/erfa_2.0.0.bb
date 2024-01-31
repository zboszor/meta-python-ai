DESCRIPTION = "Essential Routines for Fundamental Astronomy."
HOMEPAGE = "https://github.com/liberfa/erfa"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3bf64812f3978ca34d736c246d447050"

inherit autotools pkgconfig

#PR = "r1"

SRC_URI = "git://github.com/liberfa/erfa.git;protocol=https;branch=master"

SRCREV = "eb4c95dfc128fc893987330b5bf3c6413065eb53"

S = "${WORKDIR}/git"

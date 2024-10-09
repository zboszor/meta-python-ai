DESCRIPTION = "A clean C library for processing UTF-8 Unicode data"
HOMEPAGE = "https://github.com/JuliaStrings/utf8proc"
LICENSE = "MIT"

inherit cmake

#PR = "r1"

LIC_FILES_CHKSUM = "file://LICENSE.md;md5=96d5a3ba306e0f24fb289427af484408"

SRC_URI = "git://github.com/JuliaStrings/utf8proc.git;protocol=https;branch=master"

SRCREV = "34db3f7954e9298e89f42641ac78e0450f80a70d"

S = "${UNPACKDIR}/git"

EXTRA_OECMAKE = "-DBUILD_SHARED_LIBS=ON"

BBCLASSEXTEND = "native"

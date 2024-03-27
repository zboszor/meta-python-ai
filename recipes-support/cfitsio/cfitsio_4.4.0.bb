DESCRIPTION = "Library for manipulating FITS data files"
HOMEPAGE = "https://heasarc.gsfc.nasa.gov/fitsio/"
LICENSE = "NASA-1.3"

DEPENDS = "zlib bzip2 curl"

inherit autotools-brokensep pkgconfig

#PR = "r1"

LIC_FILES_CHKSUM = "file://licenses/NASA_Open_Source_Agreement_1.3.txt;md5=50ca71c0848be9ed864756ed2b32ba47"

SRC_URI = " \
	git://github.com/zboszor/cfitsio.git;protocol=https;branch=master \
	file://cfitsio-noversioncheck.patch \
	file://cfitsio-pkgconfig.patch \
	file://cfitsio-ldflags.patch \
	file://cfitsio-remove-rpath.patch \
"

SRCREV = "6fa3b7c48299326a1d93b80db2ce7b7ac55a276d"

S = "${WORKDIR}/git"

do_install:append () {
	chown -R root:root ${D}${prefix}
}

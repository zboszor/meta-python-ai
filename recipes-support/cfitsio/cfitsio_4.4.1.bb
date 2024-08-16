DESCRIPTION = "Library for manipulating FITS data files"
HOMEPAGE = "https://heasarc.gsfc.nasa.gov/fitsio/"
LICENSE = "NASA-1.3"

DEPENDS = "zlib bzip2 curl"

inherit autotools-brokensep pkgconfig

#PR = "r1"

LIC_FILES_CHKSUM = "file://licenses/License.txt;md5=77856e8a5492e2119200b3401a8e7966"

SRC_URI = " \
	git://github.com/zboszor/cfitsio.git;protocol=https;branch=master \
	file://cfitsio-noversioncheck.patch \
	file://cfitsio-pkgconfig.patch \
	file://cfitsio-ldflags.patch \
	file://cfitsio-remove-rpath.patch \
"

SRCREV = "4ba65ba446843b5355511191e5d6617c767bdefd"

S = "${WORKDIR}/git"

do_install:append () {
	chown -R root:root ${D}${prefix}
}

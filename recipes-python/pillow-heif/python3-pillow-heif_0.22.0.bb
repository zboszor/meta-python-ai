SUMMARY = "Python interface for libheif library"
LICENSE = "BSD-3-Clause & LGPL-3.0-only & GPL-2.0-only & BSD-2-Clause"
LIC_FILES_CHKSUM = " \
	file://LICENSE.txt;md5=b6c07a92aed67c33bc346748d7c7e991 \
	file://LICENSES_bundled.txt;md5=57b2c81d3026f29964bd1f98054e2700 \
"

DEPENDS = "libheif"

PYPI_PACKAGE = "pillow_heif"

inherit pypi python_setuptools_build_meta pkgconfig
SRC_URI[sha256sum] = "61d473929340d3073722f6316b7fbbdb11132faa6bac0242328e8436cc55b39a"

SRC_URI += "file://dont-use-host-dirs.patch"

export LIBHEIF_ROOT = "${STAGING_EXECPREFIXDIR}"

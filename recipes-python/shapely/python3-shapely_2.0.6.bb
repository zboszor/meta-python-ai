SUMMARY = "Manipulation and analysis of geometric objects"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=771eb47113291428a083f6bf398fa3cb"

DEPENDS = " \
	python3-cython-native \
	python3-numpy-native \
	python3-numpy \
	geos \
"

#PR = "r1"

PYPI_PACKAGE = "shapely"

inherit pypi setuptools3
SRC_URI[sha256sum] = "997f6159b1484059ec239cacaa53467fd8b5564dabe186cd84ac2944663b0bf6"

export GEOS_INCLUDE_PATH = "${STAGING_INCDIR}"
export GEOS_LIBRARY_PATH = "${STAGING_LIBDIR}"

RDEPENDS:${PN} = " \
	python3-core \
	python3-six \
	python3-json \
	python3-pyparsing \
	python3-numpy \
	python3-ctypes \
	python3-logging \
	python3-pprint \
	python3-pytest \
	python3-threading \
	python3-pyproj \
	geos \
"

SUMMARY = "Python interface to the ecCodes GRIB and BUFR decoder/encoder"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3834313ad332ed00622303391ce6ef09"

DEPENDS = "eccodes"

PYPI_PACKAGE = "eccodes"

inherit setuptools3

SRC_URI = " \
	git://github.com/ecmwf/eccodes-python.git;protocol=https;branch=master \
	file://0001-No-rpath.patch \
"

SRCREV = "c1d86a14e1a49aad694f31f183c101285ecc237b"

SETUPTOOLS_BUILD_ARGS = "--binary-wheel"

RDEPENDS:${PN} = " \
	python3-attrs \
	python3-cffi \
	python3-findlibs \
	python3-numpy \
"

SUMMARY = "Python interface to the ecCodes GRIB and BUFR decoder/encoder"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3834313ad332ed00622303391ce6ef09"

PYPI_PACKAGE = "eccodes"

inherit pypi setuptools3 cython
SRC_URI[sha256sum] = "f3e209f5da5a7fcee4942295db4ee7888e077bd2e0342e6170ec5fedb9b29840"

RDEPENDS:${PN} = " \
	python3-attrs \
	python3-cffi \
	python3-findlibs \
	python3-numpy \
"

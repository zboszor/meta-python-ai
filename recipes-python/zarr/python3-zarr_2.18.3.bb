SUMMARY = "An implementation of chunked, compressed, N-dimensional arrays for Python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=4d29e9d51e8c62a9e5137946b3cca700"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "zarr"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "2580d8cb6dd84621771a10d31c4d777dca8a27706a1a89b29f42d2d37e2df5ce"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-asciitree \
	python3-fasteners \
	python3-numcodecs \
"

SUMMARY = "Beautiful, Pythonic protocol buffers."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

PYPI_PACKAGE = "proto_plus"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "21a515a4c4c0088a773899e23c7bbade3d18f9c66c73edd4c7ee3816bc96a012"

RDEPENDS:${PN} = " \
	python3-protobuf \
	python3-google-api-core \
"

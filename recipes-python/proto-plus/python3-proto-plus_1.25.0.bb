SUMMARY = "Beautiful, Pythonic protocol buffers."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

PYPI_PACKAGE = "proto_plus"

inherit pypi setuptools3
SRC_URI[sha256sum] = "fbb17f57f7bd05a68b7707e745e26528b0b3c34e378db91eef93912c54982d91"

RDEPENDS:${PN} = " \
	python3-protobuf \
	python3-google-api-core \
"

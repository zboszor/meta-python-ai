SUMMARY = "Beautiful, Pythonic protocol buffers."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

PYPI_PACKAGE = "proto_plus"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "912a7460446625b792f6448bade9e55cd4e41e6ac10e27009ef71a7f317fa147"

RDEPENDS:${PN} = " \
	python3-protobuf \
	python3-google-api-core \
"

BBCLASSEXTEND = "native nativesdk"

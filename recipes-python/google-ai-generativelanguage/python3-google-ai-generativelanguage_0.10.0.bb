SUMMARY = "Google Ai Generativelanguage API client library"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS = "python3-numpy-native"

PYPI_PACKAGE = "google_ai_generativelanguage"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "17e998094003a566e0fa52249fdd49e8f4c030cebe7fe0c521b40d605aba783e"

RDEPENDS:${PN} = " \
	python3-google-api-core \
	python3-google-auth \
	python3-grpcio \
	python3-proto-plus \
	python3-protobuf \
"

SUMMARY = "Google Ai Generativelanguage API client library"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS = "python3-numpy-native"

PYPI_PACKAGE = "google_ai_generativelanguage"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "274ba9fcf69466ff64e971d565884434388e523300afd468fc8e3033cd8e606e"

RDEPENDS:${PN} = " \
	python3-google-api-core \
	python3-google-auth \
	python3-proto-plus \
	python3-protobuf \
"

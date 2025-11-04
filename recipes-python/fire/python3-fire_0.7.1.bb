SUMMARY = "A library for automatically generating command line interfaces."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ab892b2b62f951d424bdb712a72584cc"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "3b208f05c736de98fb343310d090dcc4d8c78b2a89ea4f32b837c586270a9cbf"

RDEPENDS:${PN} = " \
	python3-termcolor \
"

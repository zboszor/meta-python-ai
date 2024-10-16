SUMMARY = "A library for automatically generating command line interfaces."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ab892b2b62f951d424bdb712a72584cc"

inherit pypi setuptools3

SRC_URI[sha256sum] = "961550f07936eaf65ad1dc8360f2b2bf8408fad46abbfa4d2a3794f8d2a95cdf"

RDEPENDS:${PN} = " \
	python3-termcolor \
"

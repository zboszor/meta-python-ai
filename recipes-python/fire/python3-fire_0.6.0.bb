SUMMARY = "A library for automatically generating command line interfaces."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ab892b2b62f951d424bdb712a72584cc"

inherit pypi setuptools3

SRC_URI[sha256sum] = "54ec5b996ecdd3c0309c800324a0703d6da512241bc73b553db959d98de0aa66"

RDEPENDS:${PN} = " \
	python3-six \
	python3-termcolor \
"

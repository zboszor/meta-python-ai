SUMMARY = "Ahead of Time compiler for numeric kernels"
HOMEPAGE = "https://pythran.readthedocs.io/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e277a0b6033e0cb3d510c86b74144b01"

DEPENDS = "python3-gast"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "3b77d6d970a6cf5b448facc7d4f6229c3e73909ac27ea2480c843afdadbad0fb"

RDEPENDS:${PN} = " \
	python3-beniget \
	python3-gast \
	python3-ply \
"

BBCLASSEXTEND = "native"

SUMMARY = "Ahead of Time compiler for numeric kernels"
HOMEPAGE = "https://pythran.readthedocs.io/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e277a0b6033e0cb3d510c86b74144b01"

DEPENDS = "python3-gast"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "f9bc61bcb96df2cd4b578abc5a62dfb3fbb0b0ef02c264513dfb615c5f87871c"

RDEPENDS:${PN} = " \
	python3-beniget \
	python3-gast \
"

BBCLASSEXTEND = "native"

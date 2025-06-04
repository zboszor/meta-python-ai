SUMMARY = "Ahead of Time compiler for numeric kernels"
HOMEPAGE = "https://pythran.readthedocs.io/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e277a0b6033e0cb3d510c86b74144b01"

DEPENDS = "python3-gast"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "5c003e8cbedf6dbb68c2869c49fc110ce8b5e8982993078a4a819f1dadc4fc6a"

RDEPENDS:${PN} = " \
	python3-beniget \
	python3-gast \
	python3-numpy \
	python3-ply \
"

BBCLASSEXTEND = "native"

SUMMARY = "Ahead of Time compiler for numeric kernels"
HOMEPAGE = "https://pythran.readthedocs.io/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e277a0b6033e0cb3d510c86b74144b01"

DEPENDS = "python3-gast"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "8803ed948bf841a11bbbb10472a8ff6ea24ebd70e67c3f77b77be3db900eccfe"
SRC_URI += "file://updates-deps.patch"

RDEPENDS:${PN} = " \
	python3-beniget \
	python3-gast \
	python3-ply \
"

BBCLASSEXTEND = "native"

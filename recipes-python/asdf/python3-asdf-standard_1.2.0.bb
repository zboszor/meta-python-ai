SUMMARY = "The ASDF Standard schemas"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3aac1c0e2f8dd442a922172c100bc5a4"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "asdf_standard"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "e709912faf0be2f5843a23af2731e6f76ed6c279b29df5989e1520992fa3c5cf"

SRC_URI += "file://fix-build.patch"

SUMMARY = "Utilities for building and installing packages with compiled extensions"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=a26ac0e503080444f213ad118cae910d"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "extension_helpers"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "37701c2055bbdb5b5d157541239980300694e59c95e8caf9a6533b26378d1024"

BBCLASSEXTEND = "native"

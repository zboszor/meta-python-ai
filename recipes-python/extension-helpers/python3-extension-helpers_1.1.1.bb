SUMMARY = "Utilities for building and installing packages with compiled extensions"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=a26ac0e503080444f213ad118cae910d"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "extension-helpers"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "f95dd304a523d4ff6680d9504fa1d68a4dd03bf3bfbbe0ade4d927ed9e693f00"

BBCLASSEXTEND = "native"

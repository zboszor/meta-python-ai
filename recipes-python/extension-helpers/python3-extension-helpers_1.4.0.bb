SUMMARY = "Utilities for building and installing packages with compiled extensions"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=a26ac0e503080444f213ad118cae910d"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "extension_helpers"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "78d04185f196e3e0bc5fd8418ce298b014c46f7ac609f6a8c10bf70e8c978324"

BBCLASSEXTEND = "native"

SUMMARY = "A tiny CSS parser"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1d072d7e30e34f33f8ae956ada04fa2c"

DEPENDS = "python3-flit-core-native"

PYPI_PACKAGE = "tinycss2"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "b2e44dd8883c360c35dd0d1b5aad0b610e5156c2cb3b33434634e539ead9d8bf"

RDEPENDS:${PN} = "python3-webencodings"

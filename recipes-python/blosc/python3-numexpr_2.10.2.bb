SUMMARY = "Fast numerical expression evaluator for NumPy"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8456f59969f28c12ec74f335284a9115"

DEPENDS = "python3-numpy-native python3-numpy"

PYPI_PACKAGE = "numexpr"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "b0aff6b48ebc99d2f54f27b5f73a58cb92fde650aeff1b397c71c8788b4fff1a"

RDEPENDS:${PN} = "python3-numpy"

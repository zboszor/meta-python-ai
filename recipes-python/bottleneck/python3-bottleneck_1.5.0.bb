SUMMARY = "Fast NumPy array functions written in C"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3ec3d22bf4e7a40975f2d42f9bce45dc"

DEPENDS = "python3-versioneer-native python3-numpy-native"

PYPI_PACKAGE = "bottleneck"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "c860242cf20e69d5aab2ec3c5d6c8c2a15f19e4b25b28b8fca2c2a12cefae9d8"

RDEPENDS:${PN} = "python3-numpy"

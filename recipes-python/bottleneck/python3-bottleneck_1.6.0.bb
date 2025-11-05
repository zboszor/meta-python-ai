SUMMARY = "Fast NumPy array functions written in C"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3ec3d22bf4e7a40975f2d42f9bce45dc"

DEPENDS = "python3-versioneer-native python3-numpy-native"

PYPI_PACKAGE = "bottleneck"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "028d46ee4b025ad9ab4d79924113816f825f62b17b87c9e1d0d8ce144a4a0e31"

RDEPENDS:${PN} = "python3-numpy"

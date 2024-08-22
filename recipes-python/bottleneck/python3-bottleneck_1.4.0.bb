SUMMARY = "Fast NumPy array functions written in C"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3ec3d22bf4e7a40975f2d42f9bce45dc"

DEPENDS = "python3-pip-native python3-numpy-native"

PYPI_PACKAGE = "bottleneck"

inherit pypi setuptools3
SRC_URI[sha256sum] = "beb36df519b8709e7d357c0c9639b03b885ca6355bbf5e53752c685de51605b8"

RDEPENDS:${PN} = "python3-numpy"

SUMMARY = "Fast NumPy array functions written in C"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3ec3d22bf4e7a40975f2d42f9bce45dc"

DEPENDS = "python3-pip-native python3-numpy-native"

PYPI_PACKAGE = "bottleneck"

inherit pypi setuptools3
SRC_URI[sha256sum] = "58c66619db62291c9ca3b497b05f40f7b1ff9ac010b88bff1925f3101dae2c89"

RDEPENDS:${PN} = "python3-numpy"

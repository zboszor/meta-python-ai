SUMMARY = "Fast NumPy array functions written in C"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3ec3d22bf4e7a40975f2d42f9bce45dc"

DEPENDS = "python3-pip-native python3-numpy-native"

PYPI_PACKAGE = "Bottleneck"

inherit pypi setuptools3
SRC_URI[sha256sum] = "6780d896969ba7f53c8995ba90c87c548beb3db435dc90c60b9a10ed1ab4d868"

RDEPENDS:${PN} = "python3-numpy"

SUMMARY = "cython_bbox is widely used in object detection tasks"
LICENSE = "MIT & UCB & BSD-3-Clause "
LIC_FILES_CHKSUM = "file://LICENSE;md5=a3510fe5e9cf1dc156b7ba1812974594"

DEPENDS = "python3-cython-native python3-numpy-native"

PYPI_PACKAGE = "cython_bbox"
PYPI_PACKAGE_EXT = "tar.gz"

inherit pypi setuptools3
SRC_URI[sha256sum] = "c73a513e4f668db483e703701707c6d289de61322f8083635111cf8ee3e969a2"

RDEPENDS:${PN} = "python3-numpy"

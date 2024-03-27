SUMMARY = "FFMPEG wrapper for Python"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6c357400c52c80176e076a6d9eaed6d2"

DEPENDS = "python3-pip-native"

PYPI_PACKAGE = "imageio-ffmpeg"

inherit pypi setuptools3
SRC_URI[sha256sum] = "39bcd1660118ef360fa4047456501071364661aa9d9021d3d26c58f1ee2081f5"

RDEPENDS:${PN} = "ffmpeg"

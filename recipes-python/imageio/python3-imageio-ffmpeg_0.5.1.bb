SUMMARY = "FFMPEG wrapper for Python"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6c357400c52c80176e076a6d9eaed6d2"

DEPENDS = "python3-pip-native"

PYPI_PACKAGE = "imageio-ffmpeg"

inherit pypi setuptools3
SRC_URI[sha256sum] = "0ed7a9b31f560b0c9d929c5291cd430edeb9bed3ce9a497480e536dd4326484c"

RDEPENDS:${PN} = "ffmpeg"

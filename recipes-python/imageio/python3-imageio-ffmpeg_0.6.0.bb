SUMMARY = "FFMPEG wrapper for Python"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4c1d517105fede816785b75e91a3a1e5"

DEPENDS = "python3-pip-native"

PYPI_PACKAGE = "imageio_ffmpeg"

inherit pypi setuptools3
SRC_URI[sha256sum] = "e2556bed8e005564a9f925bb7afa4002d82770d6b08825078b7697ab88ba1755"

RDEPENDS:${PN} = "ffmpeg"

SUMMARY = "Pythonic bindings for FFmpeg's libraries."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a9c4cea4308c4521674ecd7c3255d8af"

DEPENDS = "python3-cython-native ffmpeg"

PYPI_PACKAGE = "av"

inherit pypi python_setuptools_build_meta pkgconfig

SRC_URI[sha256sum] = "d3da736c55847d8596eb8c26c60e036f193001db3bc5c10da8665622d906c17e"

RDEPENDS:${PN} = "ffmpeg"

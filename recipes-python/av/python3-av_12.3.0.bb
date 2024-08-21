SUMMARY = "Pythonic bindings for FFmpeg's libraries."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a9c4cea4308c4521674ecd7c3255d8af"

DEPENDS = "python3-cython-native ffmpeg"

PYPI_PACKAGE = "av"

inherit pypi python_setuptools_build_meta pkgconfig

SRC_URI[sha256sum] = "04b1892562aff3277efc79f32bd8f1d0cbb64ed011241cb3e96f9ad471816c22"

RDEPENDS:${PN} = "ffmpeg"

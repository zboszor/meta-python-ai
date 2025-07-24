SUMMARY = "Pythonic bindings for FFmpeg's libraries."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a9c4cea4308c4521674ecd7c3255d8af"

DEPENDS = "python3-cython-native ffmpeg"

inherit python_setuptools_build_meta pkgconfig

SRC_URI = "git://github.com/PyAV-Org/PyAV.git;protocol=https;branch=main"

SRCREV = "bc0ca08670b2672fc7a7fc8c1c73f2803f5ff6ec"


RDEPENDS:${PN} = "ffmpeg"

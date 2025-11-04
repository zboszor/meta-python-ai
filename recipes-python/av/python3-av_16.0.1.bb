SUMMARY = "Pythonic bindings for FFmpeg's libraries."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a9c4cea4308c4521674ecd7c3255d8af"

DEPENDS = "python3-cython-native ffmpeg"

inherit python_setuptools_build_meta pkgconfig

SRC_URI = "git://github.com/PyAV-Org/PyAV.git;protocol=https;branch=main"

SRCREV = "7687256d87f22f78cb75bb4aba94dc6e504c9983"

RDEPENDS:${PN} = "ffmpeg"

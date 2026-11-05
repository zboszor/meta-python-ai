SUMMARY = "Pythonic bindings for FFmpeg's libraries."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a9c4cea4308c4521674ecd7c3255d8af"

DEPENDS = "python3-cython-native ffmpeg"

inherit pypi python_setuptools_build_meta pkgconfig

SRC_URI[sha256sum] = "f04d31a42570cb8ec8216569b94491e91848cdac2ac8e7591c6141fda6cc86ee"

RDEPENDS:${PN} = "ffmpeg"

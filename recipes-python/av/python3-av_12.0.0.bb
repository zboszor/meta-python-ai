SUMMARY = "Pythonic bindings for FFmpeg's libraries."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a9c4cea4308c4521674ecd7c3255d8af"

DEPENDS = "python3-cython-native ffmpeg"

PYPI_PACKAGE = "av"

inherit pypi python_setuptools_build_meta pkgconfig

SRC_URI[sha256sum] = "bcf21ebb722d4538b4099e5a78f730d78814dd70003511c185941dba5651b14d"

RDEPENDS:${PN} = "ffmpeg"

SUMMARY = "Python library for calculating contours of 2D quadrilateral grids"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0186404b1452548f04e644440ce58e3c"

DEPENDS = "python3-pybind11-native python3-pybind11"

PYPI_PACKAGE = "contourpy"

inherit pypi python_mesonpy python3native pkgconfig
SRC_URI[sha256sum] = "083e12155b210502d0bca491432bb04d56dc3432f95a979b429f2848c3dbe880"

SRC_URI += "file://fix-tmpdir-references.patch"

export CONTOURPY_CXX11 = "1"

PACKAGECONFIG ??= ""
PACKAGECONFIG[bokeh] = ",,,python3-bokeh python3-selenium"

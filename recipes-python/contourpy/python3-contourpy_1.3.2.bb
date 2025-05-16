SUMMARY = "Python library for calculating contours of 2D quadrilateral grids"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0186404b1452548f04e644440ce58e3c"

DEPENDS = "python3-pybind11-native python3-pybind11"

PYPI_PACKAGE = "contourpy"

inherit pypi python_mesonpy python3native pkgconfig
SRC_URI[sha256sum] = "b6945942715a034c671b7fc54f9588126b0b8bf23db2696e3ca8328f3ff0ab54"

export CONTOURPY_CXX11 = "1"

PACKAGECONFIG ?? = ""
PACKAGECONFIG[bokeh] = ",,,python3-bokeh python3-selenium"

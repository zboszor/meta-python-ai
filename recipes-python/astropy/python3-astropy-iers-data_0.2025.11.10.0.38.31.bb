SUMMARY = "IERS Earth Rotation and Leap Second tables for the astropy core package"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=ce7f91bf4cd109fcba43fb6c697980b1"

DEPENDS = "python3-hatch-vcs-native"

PYPI_PACKAGE = "astropy_iers_data"

inherit pypi python_hatchling
SRC_URI[sha256sum] = "487dc974b9a5114ac75ff4fd96244e8fa7d07e1504092f7c2b8138c2b9c842e9"

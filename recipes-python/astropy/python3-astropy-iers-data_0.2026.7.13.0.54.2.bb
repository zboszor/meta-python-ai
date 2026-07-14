SUMMARY = "IERS Earth Rotation and Leap Second tables for the astropy core package"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=ce7f91bf4cd109fcba43fb6c697980b1"

DEPENDS = "python3-hatch-vcs-native"

PYPI_PACKAGE = "astropy_iers_data"

inherit pypi python_hatchling
SRC_URI[sha256sum] = "d86e32e95e98a86f83b5b073627442924a0f45cf61a7828da4f565a17d726c2f"

SUMMARY = "IERS Earth Rotation and Leap Second tables for the astropy core package"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=ce7f91bf4cd109fcba43fb6c697980b1"

DEPENDS = "python3-hatch-vcs-native"

PYPI_PACKAGE = "astropy_iers_data"

inherit pypi python_hatchling
SRC_URI[sha256sum] = "1e1410c010bd086718382f792e6ec7e9e4dde47f72a788eaef4d4b5a1f4663bd"

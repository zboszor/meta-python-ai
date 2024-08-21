SUMMARY = "IERS Earth Rotation and Leap Second tables for the astropy core package"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=ce7f91bf4cd109fcba43fb6c697980b1"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "astropy_iers_data"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "f8bea6abbdc8a3076b67a0941e3c1e6c89e5dffb5582a92c1a6e43e4a2e51c4a"

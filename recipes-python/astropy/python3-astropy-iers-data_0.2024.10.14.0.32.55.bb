SUMMARY = "IERS Earth Rotation and Leap Second tables for the astropy core package"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=ce7f91bf4cd109fcba43fb6c697980b1"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "astropy_iers_data"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "efe7e5b26fa064df08fcda528ea910c79137625208ccc4073addf4f0eb9289a0"

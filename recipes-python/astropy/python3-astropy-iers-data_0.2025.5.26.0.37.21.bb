SUMMARY = "IERS Earth Rotation and Leap Second tables for the astropy core package"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=ce7f91bf4cd109fcba43fb6c697980b1"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "astropy_iers_data"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "a910ed22a46e5b1961aaabfa085da77c9772284a5b982379623f441f8b9856fc"

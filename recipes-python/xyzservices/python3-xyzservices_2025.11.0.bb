SUMMARY = "Source of XYZ tiles providers"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6a3e440ffacb99f21fa410467c048574"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "xyzservices"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "2fc72b49502b25023fd71e8f532fb4beddbbf0aa124d90ea25dba44f545e17ce"

FILES:${PN} += "${datadir}/${PYPI_PACKAGE}/"

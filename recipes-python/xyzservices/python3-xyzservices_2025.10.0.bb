SUMMARY = "Source of XYZ tiles providers"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6a3e440ffacb99f21fa410467c048574"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "xyzservices"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "c6b7648276c98e8222fbec84d9c763128cf3653705017a4d6c4c3652480ee144"

FILES:${PN} += "${datadir}/${PYPI_PACKAGE}/"

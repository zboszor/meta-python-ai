SUMMARY = "Source of XYZ tiles providers"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6a3e440ffacb99f21fa410467c048574"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "xyzservices"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "6fe764713648fac53450fbc61a3c366cb6ae5335a1b2ae0c3796b495de3709d8"

FILES:${PN} += "${datadir}/${PYPI_PACKAGE}/"

SUMMARY = "Source of XYZ tiles providers"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6a3e440ffacb99f21fa410467c048574"

PYPI_PACKAGE = "xyzservices"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "091229269043bc8258042edbedad4fcb44684b0473ede027b5672ad40dc9fa02"

DEPENDS += "python3-setuptools-scm-native"

FILES:${PN} += "${datadir}/${PYPI_PACKAGE}/"

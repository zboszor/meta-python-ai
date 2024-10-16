SUMMARY = "Source of XYZ tiles providers"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6a3e440ffacb99f21fa410467c048574"

PYPI_PACKAGE = "xyzservices"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "68fb8353c9dbba4f1ff6c0f2e5e4e596bb9e1db7f94f4f7dfbcb26e25aa66fde"

DEPENDS += "python3-setuptools-scm-native"

FILES:${PN} += "${datadir}/${PYPI_PACKAGE}/"

SUMMARY = "Optimised tools for group-indexing operations: aggregated sum and more."
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e333c608154192cd7bda8629b077a06d"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "numpy_groupies"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "aed4afdad55e856b9e737fe4b4673c77e47c2f887c3663a18baaa200407c23e0"

RDEPENDS:${PN} = "python3-numpy"

RRECOMMENDS:${PN} = "python3-numba"

BBCLASSEXTEND = "native"

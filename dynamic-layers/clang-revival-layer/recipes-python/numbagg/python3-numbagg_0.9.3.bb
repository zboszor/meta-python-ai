SUMMARY = "Fast N-dimensional aggregation functions with Numba"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e1b255cc6b17d5f69eb0ee8d1f50ffb2"

DEPENDS = "python3-setuptools-scm-native python3-numpy-native"

PYPI_PACKAGE = "numbagg"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "8d96a7c627f0a1692e2a2304e6de2d89d53c3fa2e1adef7dcb5f1541e95c1752"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-numba \
"

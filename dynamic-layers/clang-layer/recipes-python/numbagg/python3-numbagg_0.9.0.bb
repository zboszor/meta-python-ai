SUMMARY = "Fast N-dimensional aggregation functions with Numba"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e1b255cc6b17d5f69eb0ee8d1f50ffb2"

DEPENDS = "python3-setuptools-scm-native python3-numpy-native"

PYPI_PACKAGE = "numbagg"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "45ba41077b7a621e35eaa4c294d90b22e75e8513b8c211f59d2b9be840fc1175"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-numba \
"

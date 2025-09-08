SUMMARY = "Fast N-dimensional aggregation functions with Numba"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e1b255cc6b17d5f69eb0ee8d1f50ffb2"

DEPENDS = "python3-setuptools-scm-native python3-numpy-native"

PYPI_PACKAGE = "numbagg"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "7c3107d9fa10de999d17640bedb835669005008b16eb0aa308d6854b1ce49d2b"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-numba \
"

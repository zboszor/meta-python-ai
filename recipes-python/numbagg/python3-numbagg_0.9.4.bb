SUMMARY = "Fast N-dimensional aggregation functions with Numba"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e1b255cc6b17d5f69eb0ee8d1f50ffb2"

DEPENDS = "python3-setuptools-scm-native python3-numpy-native"

PYPI_PACKAGE = "numbagg"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "4aaddc7ca306c38e991f8b812d129a81f31cb77a066282d1e0b18cea5c126250"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-numba \
"

SUMMARY = "A set of python modules for machine learning and data mining"
HOMEPAGE = "http://scikit-learn.org"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=c0c49304a5cb997fd012292beee4ddce"

DEPENDS = "python3-numpy-native python3-scipy-native"

PYPI_PACKAGE = "scikit_learn"
SRC_URI[sha256sum] = "20e9e49ecd130598f1ca38a1d85090e1a600147b9c02fa6f15d69cb53d968fda"

inherit pypi python_mesonpy pkgconfig python3native cython

RDEPENDS:${PN} += " \
	python3-numpy \
	python3-scipy \
	python3-joblib \
	python3-threadpoolctl \
"

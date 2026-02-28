SUMMARY = "A set of python modules for machine learning and data mining"
HOMEPAGE = "http://scikit-learn.org"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=c0c49304a5cb997fd012292beee4ddce"

DEPENDS = "python3-numpy-native python3-scipy-native"

PYPI_PACKAGE = "scikit_learn"
SRC_URI[sha256sum] = "9bccbb3b40e3de10351f8f5068e105d0f4083b1a65fa07b6634fbc401a6287fd"

SRC_URI += "file://accept-newer-scipy.patch"

inherit pypi python_mesonpy pkgconfig python3native cython

RDEPENDS:${PN} += " \
	python3-numpy \
	python3-scipy \
	python3-joblib \
	python3-threadpoolctl \
"

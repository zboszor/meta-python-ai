SUMMARY = "A set of python modules for machine learning and data mining"
HOMEPAGE = "http://scikit-learn.org"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=c0c49304a5cb997fd012292beee4ddce"

DEPENDS = "python3-numpy-native python3-scipy-native"

PYPI_PACKAGE = "scikit_learn"
SRC_URI[sha256sum] = "b4fc2525eca2c69a59260f583c56a7557c6ccdf8deafdba6e060f94c1c59738e"

inherit pypi python_mesonpy pkgconfig python3native cython

RDEPENDS:${PN} += " \
	python3-numpy \
	python3-scipy \
	python3-joblib \
	python3-threadpoolctl \
"

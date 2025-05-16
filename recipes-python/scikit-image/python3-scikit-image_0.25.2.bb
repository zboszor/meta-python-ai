SUMMARY = "Image processing in Python"
LICENSE = "BSD-2-Clause & BSD-3-Clause & MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=5b1729326cc368efafba32389bb032e5"

DEPENDS = "python3-numpy-native python3-pythran-native python3-lazy-loader-native"

PYPI_PACKAGE = "scikit_image"

inherit pypi python_mesonpy pkgconfig python3native cython

SRC_URI += "file://0001-Use-cython3-executable.patch"

SRC_URI[sha256sum] = "e5a37e6cd4d0c018a7a55b9d601357e3382826d3888c10d0213fc63bff977dde"

do_configure:prepend () {
	find ${S} -name "*.py" -exec sed -i 's:^#!/usr/bin/env python$:#!/usr/bin/env python3:' {} \;
}

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-scipy \
	python3-networkx \
	python3-pillow \
	python3-imageio \
	python3-tifffile \
	python3-lazy-loader \
	python3-pywavelets \
	python3-scikit-learn \
	python3-matplotlib \
	python3-cloudpickle \
	python3-astropy \
	python3-dask \
"

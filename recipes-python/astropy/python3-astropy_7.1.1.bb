SUMMARY = "Astronomy and astrophysics core library"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=561b0c9556fcb758e33a5a0ac941556f"

DEPENDS = " \
	python3-extension-helpers-native \
	python3-numpy-native python3-setuptools-scm-native \
"

PYPI_PACKAGE = "astropy"

inherit pypi python_setuptools_build_meta cython
SRC_URI[sha256sum] = "6d128f0005e2c34f70113484468bf9d0e4ca1ee15a279cfd08bdd979d38db0f8"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-pyerfa \
	python3-astropy-iers-data \
	python3-pyyaml \
	python3-scipy \
	python3-matplotlib \
	python3-ipython \
	python3-certifi \
	python3-dask \
	python3-h5py \
	python3-pyarrow \
	python3-beautifulsoup4 \
	python3-html5lib \
	python3-bleach \
	python3-pandas \
	python3-sortedcontainers \
	python3-pytz \
	python3-jplephem \
	python3-mpmath \
	python3-asdf \
	python3-asdf-astropy \
	python3-bottleneck \
	python3-fsspec \
	python3-s3fs \
	python3-uncompresspy \
"

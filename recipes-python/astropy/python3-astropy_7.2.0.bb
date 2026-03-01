SUMMARY = "Astronomy and astrophysics core library"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=561b0c9556fcb758e33a5a0ac941556f"

DEPENDS = " \
	python3-extension-helpers-native \
	python3-numpy-native python3-setuptools-scm-native \
	python3-pyerfa-native \
"

PYPI_PACKAGE = "astropy"

inherit pypi python_setuptools_build_meta cython
SRC_URI[sha256sum] = "ae48bc26b1feaeb603cd94bd1fa1aa39137a115fe931b7f13787ab420e8c3070"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-pyerfa \
	python3-astropy-iers-data \
	python3-pyyaml \
	python3-scipy \
	python3-matplotlib \
	python3-narwhals \
	python3-polars \
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

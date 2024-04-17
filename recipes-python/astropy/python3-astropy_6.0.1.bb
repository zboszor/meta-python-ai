SUMMARY = "Astronomy and astrophysics core library"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=561b0c9556fcb758e33a5a0ac941556f"

DEPENDS = " \
	python3-cython-native python3-extension-helpers-native \
	python3-numpy-native python3-setuptools-scm-native \
"

PYPI_PACKAGE = "astropy"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "89a975de356d0608e74f1f493442fb3acbbb7a85b739e074460bb0340014b39c"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-pyerfa \
	python3-astropy-iers-data \
	python3-pyyaml \
	python3-scipy \
	python3-matplotlib \
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
	python3-asdf-astropy \
	python3-bottleneck \
	python3-ipython \
	python3-pytest \
	python3-typing-extensions \
	python3-fsspec \
	python3-s3fs \
	python3-packaging \
	python3-pre-commit \
"

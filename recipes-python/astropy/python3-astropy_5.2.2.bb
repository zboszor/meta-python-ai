SUMMARY = "Astronomy and astrophysics core library"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=dc3202c10b19ad68804f4885f98e5ed0"

DEPENDS = " \
	python3-cython-native python3-extension-helpers-native \
	python3-numpy-native python3-setuptools-scm-native \
"

PYPI_PACKAGE = "astropy"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "e6a9e34716bda5945788353c63f0644721ee7e5447d16b1cdcb58c48a96b0d9c"

SRC_URI += "file://no-toml.patch"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-pyerfa \
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
	python3-asdf \
	python3-bottleneck \
	python3-ipython \
	python3-pytest \
	python3-typing-extensions \
	python3-fsspec \
	python3-s3fs \
"

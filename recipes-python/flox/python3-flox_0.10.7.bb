SUMMARY = "GroupBy operations for dask.array"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b4f1b525250dc22e7a0cb28c497f868c"

DEPENDS = " \
	python3-setuptools-scm-native python3-numpy-native python3-numpy \
	python3-pandas-native python3-numpy-groupies-native \
	python3-toolz-native python3-scipy-native python3-tzdata-native \
"

PYPI_PACKAGE = "flox"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "d5e208ddb248f62987938070dc755911d400d3cc53957692714df1a1a77823f4"

RDEPENDS:${PN} = " \
	python3-pandas \
	python3-numpy \
	python3-numpy-groupies \
	python3-toolz \
	python3-scipy \
	python3-cachey \
	python3-dask \
	python3-xarray \
"

RRECOMMENDS:${PN} = " \
	python3-numba \
	python3-numbagg \
"

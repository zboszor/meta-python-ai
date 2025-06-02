SUMMARY = "Functions to make reference descriptions for ReferenceFileSystem"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1af402f281e556fadb0a1846b37f1efb"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "kerchunk"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "85a932ffb6a26a38bebc45d5f978c962263704e34dd99f66008b402cded316af"

RDEPENDS:${PN} = " \
	python3-fsspec \
	python3-numcodecs \
	python3-numpy \
	python3-ujson \
	python3-zarr \
	python3-cftime \
	python3-xarray \
	python3-h5py \
	python3-cfgrib \
	python3-scipy \
"

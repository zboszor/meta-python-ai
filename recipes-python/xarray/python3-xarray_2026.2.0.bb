SUMMARY = "N-D labeled arrays and datasets in Python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7533dd49d8c0fd2695d988be2c723ea6"

DEPENDS = "python3-setuptools-scm-native python3-numpy-native python3-numpy"

PYPI_PACKAGE = "xarray"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "978b6acb018770554f8fd964af4eb02f9bcc165d4085dbb7326190d92aa74bcf"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-pandas \
	python3-scipy \
	python3-bottleneck \
	python3-flox \
	python3-opt-einsum \
	python3-netcdf4 \
	python3-h5netcdf \
	python3-pydap \
	python3-zarr \
	python3-fsspec \
	python3-cftime \
	python3-pooch \
	python3-dask \
"

# These are only available if meta-clang-revival is available
RRECOMMENDS:${PN} = " \
	python3-numba \
	python3-numbagg \
"

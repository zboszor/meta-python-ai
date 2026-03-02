SUMMARY = "Read and write TIFF files"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=228837c3a3eda31fb28d51e82dd7a225"

PYPI_PACKAGE = "tifffile"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "d73cfa6d7a8f5775a1e3c9f3bfca77c992946639fb41a5bbe888878cb6964dc6"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-imagecodecs \
	python3-defusedxml \
	python3-lxml \
	python3-zarr \
	python3-fsspec \
	python3-kerchunk \
	python3-matplotlib \
"

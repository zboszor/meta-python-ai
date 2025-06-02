SUMMARY = "Read and write TIFF files"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fab05479c81115b143f2d9daabf46fa7"

PYPI_PACKAGE = "tifffile"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "63cff7cf7305c26e3f3451c0b05fd95a09252beef4f1663227d4b70cb75c5fdb"

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

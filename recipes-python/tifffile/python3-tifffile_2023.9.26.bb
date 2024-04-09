SUMMARY = "Read and write TIFF files"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a3db077904b1929962456dbf04420fc3"

PYPI_PACKAGE = "tifffile"

inherit pypi setuptools3
SRC_URI[sha256sum] = "67e355e4595aab397f8405d04afe1b4ae7c6f62a44e22d933fee1a571a48c7ae"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-matplotlib \
	python3-imagecodecs \
	python3-defusedxml \
	python3-lxml \
	python3-zarr \
	python3-fsspec \
"

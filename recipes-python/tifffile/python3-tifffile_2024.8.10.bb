SUMMARY = "Read and write TIFF files"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a234723b439c69716295c522ab084190"

PYPI_PACKAGE = "tifffile"

inherit pypi setuptools3
SRC_URI[sha256sum] = "fdc12124f1478a07b1524641dc6b50cf6bde0483011a63fd2a773094090c3dcf"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-matplotlib \
	python3-imagecodecs \
	python3-defusedxml \
	python3-lxml \
	python3-zarr \
	python3-fsspec \
"

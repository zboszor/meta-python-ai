SUMMARY = "Read and write TIFF files"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a234723b439c69716295c522ab084190"

PYPI_PACKAGE = "tifffile"

inherit pypi setuptools3
SRC_URI[sha256sum] = "3fbf3be2f995a7051a8ae05a4be70c96fc0789f22ed6f1c4104c973cf68a640b"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-matplotlib \
	python3-imagecodecs \
	python3-defusedxml \
	python3-lxml \
	python3-zarr \
	python3-fsspec \
"

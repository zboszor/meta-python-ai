SUMMARY = "Read and write TIFF files"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a234723b439c69716295c522ab084190"

PYPI_PACKAGE = "tifffile"

inherit pypi setuptools3
SRC_URI[sha256sum] = "4920a3ec8e8e003e673d3c6531863c99eedd570d1b8b7e141c072ed78ff8030d"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-matplotlib \
	python3-imagecodecs \
	python3-defusedxml \
	python3-lxml \
	python3-zarr \
	python3-fsspec \
"

SUMMARY = "Read and write TIFF files"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fab05479c81115b143f2d9daabf46fa7"

PYPI_PACKAGE = "tifffile"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "425179ec7837ac0e07bc95d2ea5bea9b179ce854967c12ba07fc3f093e58efc1"

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

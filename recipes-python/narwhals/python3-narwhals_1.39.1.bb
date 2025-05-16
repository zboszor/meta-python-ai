SUMMARY = "Extremely lightweight compatibility layer between dataframe libraries"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=70f2b43719c3b55b87337bfe5d3744bd"

PYPI_PACKAGE = "narwhals"

inherit pypi python_hatchling
SRC_URI[sha256sum] = "cf15389e6f8c5321e8cd0ca8b5bace3b1aea5f5622fa59dfd64821998741d836"

RDEPENDS:${PN} = " \
	python3-pandas \
	python3-pyarrow \
	python3-dask \
"

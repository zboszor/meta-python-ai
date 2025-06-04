SUMMARY = "Extremely lightweight compatibility layer between dataframe libraries"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=70f2b43719c3b55b87337bfe5d3744bd"

PYPI_PACKAGE = "narwhals"

inherit pypi python_hatchling
SRC_URI[sha256sum] = "0ab2e5a1757a19b071e37ca74b53b0b5426789321d68939738337dfddea629b5"

RDEPENDS:${PN} = " \
	python3-pandas \
	python3-pyarrow \
	python3-dask \
"

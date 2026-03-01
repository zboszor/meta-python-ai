SUMMARY = "Extremely lightweight compatibility layer between dataframe libraries"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=70f2b43719c3b55b87337bfe5d3744bd"

PYPI_PACKAGE = "narwhals"

inherit pypi python_hatchling
SRC_URI[sha256sum] = "ebd5bc95bcfa2f8e89a8ac09e2765a63055162837208e67b42d6eeb6651d5e67"

RDEPENDS:${PN} = " \
	python3-pandas \
	python3-pyarrow \
	python3-polars \
	python3-dask \
"

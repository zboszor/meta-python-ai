SUMMARY = "Extremely lightweight compatibility layer between dataframe libraries"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=70f2b43719c3b55b87337bfe5d3744bd"

PYPI_PACKAGE = "narwhals"

inherit pypi python_hatchling
SRC_URI[sha256sum] = "075b6d56f3a222613793e025744b129439ecdff9292ea6615dd983af7ba6ea44"

RDEPENDS:${PN} = " \
	python3-pandas \
	python3-pyarrow \
	python3-dask \
"

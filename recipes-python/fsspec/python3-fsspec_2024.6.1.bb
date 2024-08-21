SUMMARY = "File-system specification"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b38a11bf4dcdfc66307f8515ce1fbaa6"

PYPI_PACKAGE = "fsspec"

inherit pypi python_hatchling
SRC_URI[sha256sum] = "fad7d7e209dd4c1208e3bbfda706620e0da5142bebbd9c384afb95b07e798e49"

DEPENDS += "python3-hatch-vcs-native"

RDEPENDS:${PN} = " \
	python3-dask \
	python3-distributed \
	python3-requests \
	python3-aiohttp \
	python3-paramiko \
	python3-s3fs \
	python3-libarchive-c \
	python3-tqdm \
"

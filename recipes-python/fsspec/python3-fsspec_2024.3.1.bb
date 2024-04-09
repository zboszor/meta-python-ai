SUMMARY = "File-system specification"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b38a11bf4dcdfc66307f8515ce1fbaa6"

PYPI_PACKAGE = "fsspec"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "f39780e282d7d117ffb42bb96992f8a90795e4d0fb0f661a70ca39fe9c43ded9"

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

SUMMARY = "File-system specification"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b38a11bf4dcdfc66307f8515ce1fbaa6"

PYPI_PACKAGE = "fsspec"

inherit pypi python_hatchling
SRC_URI[sha256sum] = "4b0afb90c2f21832df142f292649035d80b421f60a9e1c027802e5a0da2b04e8"

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
	python3-pyarrow \
	python3-libarchive-c \
"

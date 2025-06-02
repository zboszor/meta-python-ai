SUMMARY = "File-system specification"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b38a11bf4dcdfc66307f8515ce1fbaa6"

DEPENDS = "python3-hatch-vcs-native"

PYPI_PACKAGE = "fsspec"

inherit pypi python_hatchling
SRC_URI[sha256sum] = "2e55e47a540b91843b755e83ded97c6e897fa0942b11490113f09e9c443c2475"

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

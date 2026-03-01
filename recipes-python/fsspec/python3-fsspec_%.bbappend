PV = "2026.2.0"
SRC_URI[sha256sum] = "6544e34b16869f5aacd5b90bdf1a71acb37792ea3ddf6125ee69a22a53fb8bff"

RDEPENDS:${PN} += " \
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

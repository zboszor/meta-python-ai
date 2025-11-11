PV = "2025.10.0"
SRC_URI[sha256sum] = "b6789427626f068f9a83ca4e8a3cc050850b6c0f71f99ddb4f542b8266a26a59"

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

PV = "2025.12.0"
SRC_URI[sha256sum] = "c505de011584597b1060ff778bb664c1bc022e87921b0e4f10cc9c44f9635973"

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

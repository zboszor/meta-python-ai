SUMMARY = "Async client for aws services using botocore and aiohttp"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=55150c668a8c5a6b580ae9a69ae2d8cd"

PYPI_PACKAGE = "aiobotocore"

inherit pypi setuptools3
SRC_URI[sha256sum] = "8ae2ffe3fd227923c69e12271b7a723c7c93853d8dbbd214e774613bd444b32f"

RDEPENDS:${PN} = " \
	python3-botocore \
	python3-aiohttp \
	python3-wrapt \
	python3-aioitertools \
	python3-awscli \
	python3-boto3 \
"

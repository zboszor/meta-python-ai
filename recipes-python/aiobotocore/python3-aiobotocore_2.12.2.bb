SUMMARY = "Async client for aws services using botocore and aiohttp"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=55150c668a8c5a6b580ae9a69ae2d8cd"

PYPI_PACKAGE = "aiobotocore"

inherit pypi setuptools3
SRC_URI[sha256sum] = "41160f33cdada96815be7d180d1a2405fbf03f0364bac88c03d6ff1ad2cd83d7"

RDEPENDS:${PN} = " \
	python3-botocore \
	python3-aiohttp \
	python3-wrapt \
	python3-aioitertools \
	python3-awscli \
	python3-boto3 \
"

SUMMARY = "Async client for aws services using botocore and aiohttp"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=55150c668a8c5a6b580ae9a69ae2d8cd"

PYPI_PACKAGE = "aiobotocore"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "9ac1cfcaccccc80602968174aa032bf978abe36bd4e55e6781d6500909af1375"

RDEPENDS:${PN} = " \
	python3-botocore \
	python3-aiohttp \
	python3-wrapt \
	python3-aioitertools \
	python3-awscli \
	python3-boto3 \
"

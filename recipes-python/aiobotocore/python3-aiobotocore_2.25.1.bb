SUMMARY = "Async client for aws services using botocore and aiohttp"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=55150c668a8c5a6b580ae9a69ae2d8cd"

PYPI_PACKAGE = "aiobotocore"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "ea9be739bfd7ece8864f072ec99bb9ed5c7e78ebb2b0b15f29781fbe02daedbc"

RDEPENDS:${PN} = " \
	python3-aiohttp \
	python3-aioitertools \
	python3-botocore \
	python3-dateutil \
	python3-jmespath \
	python3-multidict \
	python3-wrapt \
	python3-awscli \
	python3-boto3 \
"

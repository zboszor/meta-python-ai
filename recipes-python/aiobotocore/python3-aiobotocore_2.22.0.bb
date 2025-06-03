SUMMARY = "Async client for aws services using botocore and aiohttp"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=55150c668a8c5a6b580ae9a69ae2d8cd"

PYPI_PACKAGE = "aiobotocore"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "11091477266b75c2b5d28421c1f2bc9a87d175d0b8619cb830805e7a113a170b"

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

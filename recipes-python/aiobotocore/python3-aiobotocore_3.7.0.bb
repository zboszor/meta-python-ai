SUMMARY = "Async client for aws services using botocore and aiohttp"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=76a50c3a435c21e0f6c546b5a39fbdc2"

PYPI_PACKAGE = "aiobotocore"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "c64d871ed5491a6571948dd48eabd185b46c6c23b64e3afd0c059fc7593ada30"

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

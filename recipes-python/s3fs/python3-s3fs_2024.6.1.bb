SUMMARY = "Convenient Filesystem interface over S3"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a74c5a31c7616cfe9c542d17c0e64981"

PYPI_PACKAGE = "s3fs"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "6c2106d6c34fbfbb88e3d20c6f3572896d5ee3d3512896696301c21a3c541bea"

RDEPENDS:${PN} = " \
	python3-aiobotocore \
	python3-fsspec \
	python3-aiohttp \
	python3-awscli \
	python3-boto3 \
"

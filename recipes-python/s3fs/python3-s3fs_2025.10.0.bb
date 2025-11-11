SUMMARY = "Convenient Filesystem interface over S3"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a74c5a31c7616cfe9c542d17c0e64981"

PYPI_PACKAGE = "s3fs"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "e8be6cddc77aceea1681ece0f472c3a7f8ef71a0d2acddb1cc92bb6afa3e9e4f"

RDEPENDS:${PN} = " \
	python3-aiobotocore \
	python3-fsspec \
	python3-aiohttp \
	python3-awscli \
	python3-boto3 \
"

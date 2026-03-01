SUMMARY = "Convenient Filesystem interface over S3"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a74c5a31c7616cfe9c542d17c0e64981"

PYPI_PACKAGE = "s3fs"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "91cb2a9f76e35643b76eeac3f47a6165172bb3def671f76b9111c8dd5779a2ac"

RDEPENDS:${PN} = " \
	python3-aiobotocore \
	python3-fsspec \
	python3-aiohttp \
"

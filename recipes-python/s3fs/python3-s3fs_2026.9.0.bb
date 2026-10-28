SUMMARY = "Convenient Filesystem interface over S3"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a74c5a31c7616cfe9c542d17c0e64981"

PYPI_PACKAGE = "s3fs"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "ec078ff0122d28fd21d36ea4987794e4f42ecd6e8785eeaa083208771c1464e5"

RDEPENDS:${PN} = " \
	python3-aiobotocore \
	python3-fsspec (>=2026.9.0) \
	python3-aiohttp \
"

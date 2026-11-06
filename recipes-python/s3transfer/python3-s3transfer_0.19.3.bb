SUMMARY = "An Amazon S3 Transfer Manager"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

PYPI_PACKAGE = "s3transfer"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "8326acc3d056d7f7b8a37110c7d2aea41f67e83f6ae79cd3b5fbcca34c726406"

RDEPENDS:${PN} = "python3-botocore"

SUMMARY = "An Amazon S3 Transfer Manager"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

PYPI_PACKAGE = "s3transfer"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "eff12264e7c8b4985074ccce27a3b38a485bb7f7422cc8046fee9be4983e4125"

RDEPENDS:${PN} = "python3-botocore"

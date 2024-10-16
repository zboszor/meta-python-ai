SUMMARY = "An Amazon S3 Transfer Manager"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

PYPI_PACKAGE = "s3transfer"

inherit pypi setuptools3
SRC_URI[sha256sum] = "4f50ed74ab84d474ce614475e0b8d5047ff080810aac5d01ea25231cfc944b0c"

RDEPENDS:${PN} = "python3-botocore"

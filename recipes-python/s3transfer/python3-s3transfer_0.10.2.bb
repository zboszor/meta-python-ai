SUMMARY = "An Amazon S3 Transfer Manager"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

PYPI_PACKAGE = "s3transfer"

inherit pypi setuptools3
SRC_URI[sha256sum] = "0711534e9356d3cc692fdde846b4a1e4b0cb6519971860796e6bc4c7aea00ef6"

RDEPENDS:${PN} = "python3-botocore"

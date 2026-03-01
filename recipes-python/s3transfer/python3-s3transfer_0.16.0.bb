SUMMARY = "An Amazon S3 Transfer Manager"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

PYPI_PACKAGE = "s3transfer"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "8e990f13268025792229cd52fa10cb7163744bf56e719e0b9cb925ab79abf920"

RDEPENDS:${PN} = "python3-botocore"

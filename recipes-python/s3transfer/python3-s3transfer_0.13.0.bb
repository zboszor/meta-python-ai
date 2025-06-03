SUMMARY = "An Amazon S3 Transfer Manager"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

PYPI_PACKAGE = "s3transfer"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "f5e6db74eb7776a37208001113ea7aa97695368242b364d73e91c981ac522177"

RDEPENDS:${PN} = "python3-botocore"

HOMEPAGE = "https://github.com/boto/boto"
SUMMARY = "Amazon Web Services API"
DESCRIPTION = "\
  Boto3 is the Amazon Web Services (AWS) Software Development Kit (SDK) for Python, \
  which allows Python developers to write software that makes use of services like \
  Amazon S3 and Amazon EC2. \
  "
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2ee41112a44fe7014dce33e26468ba93"

SRC_URI[sha256sum] = "586524b623e4fbbebe28b604c6205eb12f263cc4746bccb011562d07e217a4cb"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} += " \
	python3-botocore \
	python3-jmespath \
	python3-s3transfer \
"

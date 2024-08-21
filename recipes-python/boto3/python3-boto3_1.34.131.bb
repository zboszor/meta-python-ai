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

SRC_URI[sha256sum] = "dab8f72a6c4e62b4fd70da09e08a6b2a65ea2115b27dd63737142005776ef216"

inherit pypi setuptools3

RDEPENDS:${PN} += " \
	python3-botocore \
	python3-jmespath \
	python3-s3transfer \
"

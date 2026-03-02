HOMEPAGE = "https://github.com/boto/boto"
SUMMARY = "The AWS SDK for Python"
DESCRIPTION = "\
  Boto3 is the Amazon Web Services (AWS) Software Development Kit (SDK) for Python, \
  which allows Python developers to write software that makes use of services like \
  Amazon S3 and Amazon EC2. \
  "
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2ee41112a44fe7014dce33e26468ba93"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "e7b8fcc123da442449da8a2be65b3e60a3d8cfb2b26a52f7b3c6f9f8e84cbdf0"

RDEPENDS:${PN} += " \
	python3-botocore \
	python3-jmespath \
	python3-s3transfer \
"

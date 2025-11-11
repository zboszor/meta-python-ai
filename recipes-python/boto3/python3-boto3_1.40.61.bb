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

SRC_URI[sha256sum] = "d6c56277251adf6c2bdd25249feae625abe4966831676689ff23b4694dea5b12"

RDEPENDS:${PN} += " \
	python3-botocore \
	python3-jmespath \
	python3-s3transfer \
"

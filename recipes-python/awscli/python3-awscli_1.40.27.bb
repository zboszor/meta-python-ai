SUMMARY = "Universal Command Line Environment for AWS."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7970352423db76abb33cbe303884afbf"

PYPI_PACKAGE = "awscli"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "92c84a3e9cbe3a7566bc738ad21201d9dad32dd7ab6a7a4906f7e1b29b9385ca"

RDEPENDS:${PN} = " \
	python3-botocore \
	python3-s3transfer \
	python3-pyyaml \
	python3-colorama \
	python3-rsa \
	python3-docutils \
"

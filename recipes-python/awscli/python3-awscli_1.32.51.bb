SUMMARY = "Universal Command Line Environment for AWS."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7970352423db76abb33cbe303884afbf"

PYPI_PACKAGE = "awscli"

inherit pypi setuptools3
SRC_URI[sha256sum] = "df75ca5cb98a1be366920218eaf24ec2eca5a2d91e87a3dc452b6246dff92696"

PR = "r1"

RDEPENDS:${PN} = " \
	python3-botocore \
	python3-s3transfer \
	python3-pyyaml \
	python3-colorama \
	python3-rsa \
	python3-docutils \
"

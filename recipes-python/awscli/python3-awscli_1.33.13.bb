SUMMARY = "Universal Command Line Environment for AWS."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7970352423db76abb33cbe303884afbf"

PYPI_PACKAGE = "awscli"

inherit pypi setuptools3
SRC_URI[sha256sum] = "bad4402c4a0ff825a59a43e76e0072152497f4daf7f62c9376fe6e0014fa2a9b"

#PR = "r1"

RDEPENDS:${PN} = " \
	python3-botocore \
	python3-s3transfer \
	python3-pyyaml \
	python3-colorama \
	python3-rsa \
	python3-docutils \
"

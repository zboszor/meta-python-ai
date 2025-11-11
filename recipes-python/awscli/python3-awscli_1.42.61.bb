SUMMARY = "Universal Command Line Environment for AWS."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7970352423db76abb33cbe303884afbf"

PYPI_PACKAGE = "awscli"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "c9f8e5869c4b0147f2b472ef7fa8e24be0942a3b0f4bb53dd0e7ce17d17af077"

RDEPENDS:${PN} = " \
	python3-botocore \
	python3-s3transfer \
	python3-pyyaml \
	python3-colorama \
	python3-rsa \
	python3-docutils \
"

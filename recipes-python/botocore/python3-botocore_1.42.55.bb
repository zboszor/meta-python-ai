SUMMARY = "The low-level, core functionality of boto 3."
HOMEPAGE = "https://github.com/boto/botocore"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2ee41112a44fe7014dce33e26468ba93"

SRC_URI[sha256sum] = "af22a7d7881883bcb475a627d0750ec6f8ee3d7b2f673e9ff342ebaa498447ee"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} += " \
	python3-awscrt \
	python3-jmespath \
	python3-dateutil \
	python3-urllib3 \
"

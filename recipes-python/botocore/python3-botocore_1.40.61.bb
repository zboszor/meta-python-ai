SUMMARY = "The low-level, core functionality of boto 3."
HOMEPAGE = "https://github.com/boto/botocore"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2ee41112a44fe7014dce33e26468ba93"

SRC_URI[sha256sum] = "a2487ad69b090f9cccd64cf07c7021cd80ee9c0655ad974f87045b02f3ef52cd"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} += " \
	python3-awscrt \
	python3-jmespath \
	python3-dateutil \
	python3-urllib3 \
"

SUMMARY = "The low-level, core functionality of boto 3."
HOMEPAGE = "https://github.com/boto/botocore"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2ee41112a44fe7014dce33e26468ba93"

SRC_URI[sha256sum] = "63d5977a10a375c3fc11c8e15e1ae5a4daaf450af135d55c170cc537648edf25"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} += " \
	python3-awscrt \
	python3-jmespath \
	python3-dateutil \
	python3-urllib3 \
"

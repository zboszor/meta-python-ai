SUMMARY = "A utility belt for advanced users of python-requests"
DESCRIPTION = "A utility belt for advanced users of python-requests"
HOMEPAGE = "https://toolbelt.readthedocs.io"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6f14302a4b4099009ab38b4dde5f1075"

SRC_URI[sha256sum] = "7681a0a3d047012b5bdc0ee37d7f8f07ebe76ab08caeccfc3921ce23c88d5bc6"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} = " \
	python3-requests \
"

BBCLASSEXTEND = "native nativesdk"

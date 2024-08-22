SUMMARY = "Appendable key-value storage"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=01cbb2369bb5a7c865b5a165065dabb9"

PYPI_PACKAGE = "partd"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "d022c33afbdc8405c226621b015e8067888173d85f7f5ecebb3cafed9a20f02c"

DEPENDS += "python3-versioneer-native"

RDEPENDS:${PN} = " \
	python3-locket \
	python3-toolz \
	python3-numpy \
	python3-pandas \
	python3-pyzmq \
	python3-blosc \
"

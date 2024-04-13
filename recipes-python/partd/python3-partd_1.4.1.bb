SUMMARY = "Appendable key-value storage"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=01cbb2369bb5a7c865b5a165065dabb9"

PYPI_PACKAGE = "partd"

inherit pypi setuptools3
SRC_URI[sha256sum] = "56c25dd49e6fea5727e731203c466c6e092f308d8f0024e199d02f6aa2167f67"

SRC_URI += "file://70.patch"

RDEPENDS:${PN} = " \
	python3-locket \
	python3-toolz \
	python3-numpy \
	python3-pandas \
	python3-pyzmq \
	python3-blosc \
"

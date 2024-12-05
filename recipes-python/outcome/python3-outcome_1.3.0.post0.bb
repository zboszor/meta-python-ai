SUMMARY = "Capture the outcome of Python function calls."
LICENSE = "MIT | Apache-2.0"
LIC_FILES_CHKSUM = " \
	file://LICENSE.MIT;md5=e62ba5042d5983462ad229f5aec1576c \
	file://LICENSE.APACHE2;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

PYPI_PACKAGE = "outcome"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "9dcf02e65f2971b80047b377468e72a268e15c0af3cf1238e6ff14f7f91143b8"

RDEPENDS:${PN} = " \
	python3-attrs \
"

BBCLASSEXTEND = "native nativesdk"

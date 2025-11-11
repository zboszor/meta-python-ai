SUMMARY = "URL normalization for Python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0355248f9f4025eb234b21ac43b9ad7a"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "url_normalize"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "74a540a3b6eba1d95bdc610c24f2c0141639f3ba903501e61a52a8730247ff37"

RDEPENDS:${PN} = " \
	python3-idna \
"

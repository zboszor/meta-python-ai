SUMMARY = "URL normalization for Python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0355248f9f4025eb234b21ac43b9ad7a"

DEPENDS = "python3-setuptools-scm-native python3-wheel-native"

PYPI_PACKAGE = "url_normalize"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "1655cd214159d9d47dc37aa6ce993c2149da44fa35cac6bafd90036a4eda3ac3"

RDEPENDS:${PN} = " \
	python3-idna \
"

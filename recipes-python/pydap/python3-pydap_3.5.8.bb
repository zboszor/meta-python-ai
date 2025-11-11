SUMMARY = "A pure python implementation of the Data Access Protocol."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bb456a851759baafdd0c9a38e81796ed"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "pydap"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "0dc3c7f28fd456e17ed1c789ccfd119938a2bd1d73828cdf5319c69a213df560"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-requests \
	python3-requests-cache \
	python3-scipy \
	python3-webob \
	python3-beautifulsoup4 \
	python3-lxml \
"

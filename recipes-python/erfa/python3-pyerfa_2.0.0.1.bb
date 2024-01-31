SUMMARY = "Python bindings for ERFA"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=80429025721c18302a1bc93620fcffe1"

DEPENDS = " \
	python3-packaging-native python3-numpy-native \
	python3-jinja2-native python3-setuptools-scm-native \
	erfa \
"

PYPI_PACKAGE = "pyerfa"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "2fd4637ffe2c1e6ede7482c13f583ba7c73119d78bef90175448ce506a0ede30"

SRC_URI += "file://no-toml.patch"

export PYERFA_USE_SYSTEM_LIBERFA = "1"

RDEPENDS:${PN} = "python3-numpy erfa"

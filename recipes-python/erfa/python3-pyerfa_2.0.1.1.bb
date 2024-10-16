SUMMARY = "Python bindings for ERFA"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=f8150d32d45be5c0a70dbfe9913aeaf0"

DEPENDS = " \
	python3-packaging-native python3-numpy-native \
	python3-jinja2-native python3-setuptools-scm-native \
	erfa \
"

PYPI_PACKAGE = "pyerfa"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "dbac74ef8d3d3b0f22ef0ad3bbbdb30b2a9e10570b1fa5a98be34c7be36c9a6b"

export PYERFA_USE_SYSTEM_LIBERFA = "1"

RDEPENDS:${PN} = "python3-numpy erfa"

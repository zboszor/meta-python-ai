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
SRC_URI[sha256sum] = "17d6b24fe4846c65d5e7d8c362dcb08199dc63b30a236aedd73875cc83e1f6c0"

export PYERFA_USE_SYSTEM_LIBERFA = "1"

RDEPENDS:${PN} = "python3-numpy erfa"

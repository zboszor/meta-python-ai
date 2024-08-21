SUMMARY = "Python implementation of the ASDF Standard"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d0e78b52e34ee5a6e043c7b3142cba9b"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "asdf"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "5a2f0b9de6732a472b4137aa5b59d3c20703e7b70f45ea38c2dcbfc95c6370ef"

RDEPENDS:${PN} = " \
	python3-asdf-standard \
	python3-asdf-transform-schemas \
	python3-importlib-metadata \
	python3-jmespath \
	python3-numpy \
	python3-pyyaml \
	python3-semantic-version \
	python3-attrs \
	python3-lz4 \
"

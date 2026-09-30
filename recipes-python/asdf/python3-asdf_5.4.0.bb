SUMMARY = "Python implementation of the ASDF Standard"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d0e78b52e34ee5a6e043c7b3142cba9b"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "asdf"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "d4fcfe002ed35cc33bb2832f2901ad1881b2cb35fb24c471390be970b5e690f2"

RDEPENDS:${PN} = " \
	python3-asdf-standard \
	python3-importlib-metadata \
	python3-jmespath \
	python3-numpy \
	python3-pyyaml \
	python3-semantic-version \
	python3-typing-extensions \
	python3-attrs \
	python3-lz4 \
	python3-fsspec \
"

SUMMARY = "Python implementation of the ASDF Standard"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d0e78b52e34ee5a6e043c7b3142cba9b"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "asdf"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "c96c936cb65e75d8778d889f274f79ac90464a9ef2e7b794227dc204235fdcdf"

RDEPENDS:${PN} = " \
	python3-asdf-standard \
	python3-importlib-metadata \
	python3-jmespath \
	python3-numpy \
	python3-pyyaml \
	python3-semantic-version \
	python3-attrs \
	python3-lz4 \
	python3-fsspec \
"

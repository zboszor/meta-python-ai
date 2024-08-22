SUMMARY = "A framework for managing and maintaining multi-language pre-commit hooks."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b53a93744e3ff841e5fc9a934da8e1c8"

PYPI_PACKAGE = "pre_commit"

inherit pypi setuptools3
SRC_URI[sha256sum] = "8bb6494d4a20423842e198980c9ecf9f96607a07ea29549e180eef9ae80fe7af"

RDEPENDS:${PN} = " \
	python3-cfgv \
	python3-identify \
	python3-nodeenv \
	python3-pyyaml \
	python3-virtualenv \
"

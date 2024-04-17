SUMMARY = "A framework for managing and maintaining multi-language pre-commit hooks."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b53a93744e3ff841e5fc9a934da8e1c8"

PYPI_PACKAGE = "pre_commit"

inherit pypi setuptools3
SRC_URI[sha256sum] = "e209d61b8acdcf742404408531f0c37d49d2c734fd7cff2d6076083d191cb060"

RDEPENDS:${PN} = " \
	python3-cfgv \
	python3-identify \
	python3-nodeenv \
	python3-pyyaml \
	python3-virtualenv \
"

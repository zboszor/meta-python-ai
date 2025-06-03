SUMMARY = "Type annotations for pandas"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9b125a4842e4889143c3827980689e16"

PYPI_PACKAGE = "pandas_stubs"

inherit pypi python_poetry_core
SRC_URI[sha256sum] = "e2d694c4e72106055295ad143664e5c99e5815b07190d1ff85b73b13ff019e63"

RDEPENDS:${PN} = " \
	python3-types-pytz \
	python3-numpy \
"

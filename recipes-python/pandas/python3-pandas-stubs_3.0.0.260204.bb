SUMMARY = "Type annotations for pandas"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9b125a4842e4889143c3827980689e16"

PYPI_PACKAGE = "pandas_stubs"

inherit pypi python_poetry_core
SRC_URI[sha256sum] = "bf9294b76352effcffa9cb85edf0bed1339a7ec0c30b8e1ac3d66b4228f1fbc3"

RDEPENDS:${PN} = " \
	python3-types-pytz \
	python3-numpy \
"

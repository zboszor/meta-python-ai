SUMMARY = "Type annotations for pandas"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9b125a4842e4889143c3827980689e16"

PYPI_PACKAGE = "pandas_stubs"

inherit pypi python_poetry_core
SRC_URI[sha256sum] = "c64b9932760ceefb96a3222b953e6a251321a9832a28548be6506df473a66406"

RDEPENDS:${PN} = " \
	python3-types-pytz \
	python3-numpy \
"

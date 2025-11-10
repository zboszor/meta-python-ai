SUMMARY = "ASDF schemas for coordinates"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=13d35dac857f9450d8f94c8562b220a8"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "asdf_coordinates_schemas"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "7067e46ec898f97525fc6aab585c191a2bb9cad02cf19bda7a9ea045ce0ebcc4"

RDEPENDS:${PN} = " \
	python3-asdf \
	python3-asdf-standard \
"

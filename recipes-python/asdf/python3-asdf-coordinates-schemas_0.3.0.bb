SUMMARY = "ASDF schemas for coordinates"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=13d35dac857f9450d8f94c8562b220a8"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "asdf_coordinates_schemas"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "c98b6015dcec87a158fcde7798583f0615d08125fa6e1e9de16c4eb03fcd604e"

RDEPENDS:${PN} = " \
	python3-asdf \
	python3-asdf-standard \
"

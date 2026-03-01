SUMMARY = "ASDF schemas for coordinates"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=13d35dac857f9450d8f94c8562b220a8"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "asdf_coordinates_schemas"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "d9cf72fc312f27cb8f2b9e6ce10c38ebf826e2e6b80ba1f591f75bb0eaf734e2"

RDEPENDS:${PN} = " \
	python3-asdf \
	python3-asdf-standard \
"

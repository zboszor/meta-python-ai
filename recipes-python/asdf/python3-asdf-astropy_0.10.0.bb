SUMMARY = "ASDF serialization support for astropy"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=dc3202c10b19ad68804f4885f98e5ed0"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "asdf_astropy"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "d27c7c50b012aa5f679eac4bf891117bf1e8df7e03b7367ca3054403c3397f4e"

RDEPENDS:${PN} = " \
	python3-asdf \
	python3-asdf-coordinates-schemas \
	python3-asdf-transform-schemas \
	python3-asdf-standard \
	python3-astropy \
	python3-numpy \
	python3-packaging \
"

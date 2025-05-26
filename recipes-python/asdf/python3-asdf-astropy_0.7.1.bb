SUMMARY = "ASDF serialization support for astropy"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=dc3202c10b19ad68804f4885f98e5ed0"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "asdf_astropy"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "5aa5a448ee0945bd834a9ba8fb86cf43b39e85d24260e1339b734173ab6024c7"

RDEPENDS:${PN} = " \
	python3-asdf \
	python3-asdf-coordinates-schemas \
	python3-asdf-transform-schemas \
	python3-asdf-standard \
	python3-astropy \
	python3-numpy \
	python3-packaging \
"

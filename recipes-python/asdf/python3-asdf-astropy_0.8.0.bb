SUMMARY = "ASDF serialization support for astropy"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=dc3202c10b19ad68804f4885f98e5ed0"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "asdf_astropy"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "ce081f17f2cbcf28d7ba1362d4197772fc5cd55c15960652aebf61a712ec9e97"

RDEPENDS:${PN} = " \
	python3-asdf \
	python3-asdf-coordinates-schemas \
	python3-asdf-transform-schemas \
	python3-asdf-standard \
	python3-astropy \
	python3-numpy \
	python3-packaging \
"

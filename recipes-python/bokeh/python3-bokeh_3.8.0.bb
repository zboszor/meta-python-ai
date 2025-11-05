SUMMARY = "Interactive plots and applications in the browser from Python"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=4d2241e774601133cb2c58ae1277f9a5"

DEPENDS = "python3-colorama-native python3-setuptools-git-versioning-native"

PYPI_PACKAGE = "bokeh"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "bfdf5e9df910653b097f70cd38f4c2399d91af6e54a618126e2387cc33c9ec03"

RDEPENDS:${PN} = " \
	python3-jinja2 \
	python3-contourpy \
	python3-narwhals \
	python3-numpy \
	python3-pandas \
	python3-pillow \
	python3-pyyaml \
	python3-tornado \
	python3-xyzservices \
"

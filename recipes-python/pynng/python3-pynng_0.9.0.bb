SUMMARY = "Networking made simply using nng"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=57ac8de47c94532bc709cda1fe21c1a5"

DEPENDS = " \
	python3-setuptools-scm-native \
	python3-cffi-native python3-cmake-native \
	nng \
"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "fcd839abf82a2934fa8c27ff57b574b41810458e35895bac6288814defa8fb4e"

SRC_URI += " \
	file://pynng-0.9.0-use-shared-nng.patch \
	file://unversioned-setuptools.patch \
"

RDEPENDS:${PN} = " \
	python3-cffi \
	python3-sniffio \
	python3-trio \
"

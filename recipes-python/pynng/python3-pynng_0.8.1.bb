SUMMARY = "Networking made simply using nng"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=57ac8de47c94532bc709cda1fe21c1a5"

DEPENDS = " \
	python3-setuptools-scm-native \
	python3-cffi-native python3-cmake-native \
	nng \
"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "60165f34bdf501885e0acceaeed79bc35a57f3ca3c913cb38c14919b9bd3656f"

SRC_URI += "file://pynng-0.8.1-use-shared-nng.patch"

RDEPENDS:${PN} = " \
	python3-cffi \
	python3-sniffio \
	python3-trio \
"

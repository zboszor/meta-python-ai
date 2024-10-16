SUMMARY  = "Diff JSON and JSON-like structures in Python"
HOMEPAGE = "https://github.com/xlwings/jsondiff"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=792c1f2e813587ebc2e046ff8dff59ae"

DEPENDS += "python3-setuptools-scm-native"

#PR = "r1"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "658d162c8a86ba86de26303cd86a7b37e1b2c1ec98b569a60e2ca6180545f7fe"

RDEPENDS:${PN} += "python3-json"

do_install:append () {
	# Conflicts with python3-jsonpatch in meta-openembedded
	rm -f ${D}${bindir}/jsondiff
}

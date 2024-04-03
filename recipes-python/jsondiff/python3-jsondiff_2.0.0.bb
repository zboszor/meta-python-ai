SUMMARY  = "Diff JSON and JSON-like structures in Python"
HOMEPAGE = "https://github.com/xlwings/jsondiff"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=792c1f2e813587ebc2e046ff8dff59ae"

#PR = "r1"

inherit pypi setuptools3

SRC_URI[sha256sum] = "2795844ef075ec8a2b8d385c4d59f5ea48b08e7180fce3cb2787be0db00b1fb4"

RDEPENDS_${PN} += "python3-json"

do_install:append () {
	# Conflicts with python3-jsonpatch in meta-openembedded
	rm -f ${D}${bindir}/jsondiff
}

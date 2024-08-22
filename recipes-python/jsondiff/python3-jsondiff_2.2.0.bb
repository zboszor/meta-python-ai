SUMMARY  = "Diff JSON and JSON-like structures in Python"
HOMEPAGE = "https://github.com/xlwings/jsondiff"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=792c1f2e813587ebc2e046ff8dff59ae"

#PR = "r1"

inherit pypi setuptools3

SRC_URI[sha256sum] = "060e9a10fe136c643e9d2bf264ea1fbe966ed17d2fd37348dd65b1c650c2df4f"

RDEPENDS_${PN} += "python3-json"

do_install:append () {
	# Conflicts with python3-jsonpatch in meta-openembedded
	rm -f ${D}${bindir}/jsondiff
}

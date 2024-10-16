SUMMARY = "File identification library for Python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bbdc006359f3157660173ec7f133a80e"

PYPI_PACKAGE = "identify"

inherit pypi setuptools3
SRC_URI[sha256sum] = "91478c5fb7c3aac5ff7bf9b4344f803843dc586832d5f110d672b19aa1984c98"

RDEPENDS:${PN} = " \
	python3-ukkonen \
"

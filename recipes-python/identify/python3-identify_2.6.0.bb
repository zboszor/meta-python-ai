SUMMARY = "File identification library for Python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bbdc006359f3157660173ec7f133a80e"

PYPI_PACKAGE = "identify"

inherit pypi setuptools3
SRC_URI[sha256sum] = "cb171c685bdc31bcc4c1734698736a7d5b6c8bf2e0c15117f4d469c8640ae5cf"

RDEPENDS:${PN} = " \
	python3-ukkonen \
"

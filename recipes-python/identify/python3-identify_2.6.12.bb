SUMMARY = "File identification library for Python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bbdc006359f3157660173ec7f133a80e"

PYPI_PACKAGE = "identify"

inherit pypi setuptools3
SRC_URI[sha256sum] = "d8de45749f1efb108badef65ee8386f0f7bb19a7f26185f74de6367bffbaf0e6"

RDEPENDS:${PN} = " \
	python3-ukkonen \
"

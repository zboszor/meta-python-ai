SUMMARY = "Use a JPL ephemeris to predict planet positions."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d5fd7d8b632e4cd63f04f65d9413d925"

PYPI_PACKAGE = "jplephem"

inherit pypi setuptools3_legacy
SRC_URI[sha256sum] = "d3fb9477e4bf4c39d10497d4ff15e5271b7ac03fa101e1821aac527d646eccf9"

RDEPENDS:${PN} = "python3-numpy"

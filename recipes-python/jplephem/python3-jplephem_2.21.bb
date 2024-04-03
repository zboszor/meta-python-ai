SUMMARY = "Use a JPL ephemeris to predict planet positions."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d5fd7d8b632e4cd63f04f65d9413d925"

PYPI_PACKAGE = "jplephem"

inherit pypi setuptools3_legacy
SRC_URI[sha256sum] = "34194b610695f21b89217b9852b8dabadbce80848cb369d9567ef12dc4828d55"

RDEPENDS:${PN} = "python3-numpy"

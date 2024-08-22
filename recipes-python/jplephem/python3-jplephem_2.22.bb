SUMMARY = "Use a JPL ephemeris to predict planet positions."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d5fd7d8b632e4cd63f04f65d9413d925"

PYPI_PACKAGE = "jplephem"

inherit pypi setuptools3_legacy
SRC_URI[sha256sum] = "0d9acc7217b4806feba93e72974ceead5611104bce6789af38d4f27dcf7a592c"

RDEPENDS:${PN} = "python3-numpy"

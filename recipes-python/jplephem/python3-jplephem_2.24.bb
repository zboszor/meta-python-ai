SUMMARY = "Use a JPL ephemeris to predict planet positions."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d5fd7d8b632e4cd63f04f65d9413d925"

PYPI_PACKAGE = "jplephem"

inherit pypi setuptools3_legacy
SRC_URI[sha256sum] = "354fe1adae022264ab46f18afb6af26211277cfd7b3ef90400755fcabe93bc11"

RDEPENDS:${PN} = "python3-numpy"

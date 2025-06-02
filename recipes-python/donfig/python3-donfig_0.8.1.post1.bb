SUMMARY = "Python package for configuring a python package"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=60618e8eb6cd7920d74bc2041ba40784"

DEPENDS = "python3-versioneer-native"

PYPI_PACKAGE = "donfig"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "3bef3413a4c1c601b585e8d297256d0c1470ea012afa6e8461dc28bfb7c23f52"

SRC_URI += "file://fix-deps.patch"

RDEPENDS:${PN} = "python3-pyyaml"

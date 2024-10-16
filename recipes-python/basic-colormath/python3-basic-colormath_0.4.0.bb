SUMMARY = "Salvaged colormath"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=0e0321de5ac83f324156dcefc9988be5"

PYPI_PACKAGE = "basic_colormath"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "5824f83b031da8d6e391e73e1e8248b593874680e7924dc5a4727f267e1f95d2"

DEPENDS += "python3-setuptools-scm-native"

RDEPENDS:${PN} = "python3-numpy"

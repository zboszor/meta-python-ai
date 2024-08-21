SUMMARY = "Salvaged colormath"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=7ba0758f5b042fceb937c135d73e1434"

PYPI_PACKAGE = "basic_colormath"

inherit pypi python_poetry_core
SRC_URI[sha256sum] = "d98806afedef84945cd568658c8f2e43c3e95154d4eda96e773b52a58318d564"

DEPENDS += "python3-setuptools-scm-native"

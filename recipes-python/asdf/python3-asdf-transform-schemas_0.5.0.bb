SUMMARY = "ASDF schemas for transforms"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=13d35dac857f9450d8f94c8562b220a8"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "asdf_transform_schemas"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "82cf4c782575734a895327f25ff583ce9499d7e2b836fe8880b2d7961c6b462b"

RDEPENDS:${PN} = "python3-asdf-standard"

SUMMARY = "ASDF schemas for transforms"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=13d35dac857f9450d8f94c8562b220a8"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "asdf_transform_schemas"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "0f50f8e096fffd2d14b9c82995901266ef25b23d0dffc30ad41bba46851a9732"

RDEPENDS:${PN} = "python3-asdf-standard"

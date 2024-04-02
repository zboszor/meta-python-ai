SUMMARY = "Mutable mapping tools"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=5744c6cb2b288a30f06cb6dd76a83f60"

PYPI_PACKAGE = "zict"

inherit pypi setuptools3
SRC_URI[sha256sum] = "e321e263b6a97aafc0790c3cfb3c04656b7066e6738c37fffcca95d803c9fba5"

RDEPENDS:${PN} = "python3-heapdict"

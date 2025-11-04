SUMMARY = "Fast numerical expression evaluator for NumPy"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8456f59969f28c12ec74f335284a9115"

DEPENDS = "python3-numpy-native python3-numpy"

PYPI_PACKAGE = "numexpr"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "4be00b1086c7b7a5c32e31558122b7b80243fe098579b170967da83f3152b48b"

RDEPENDS:${PN} = "python3-numpy"

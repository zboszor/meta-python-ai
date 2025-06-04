SUMMARY = "A Python library for manipulating indices of ndarrays."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ae65fd258e03a8a2ef8e4af43d498474"

PYPI_PACKAGE = "ndindex"

inherit pypi python_setuptools_build_meta cython
SRC_URI[sha256sum] = "20e3a2f0a8ed4646abf0f13296aab0b5b9cc8c5bc182b71b5945e76eb6f558bb"

RDEPENDS:${PN} = "python3-numpy"

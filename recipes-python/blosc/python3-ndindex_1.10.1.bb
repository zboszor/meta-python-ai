SUMMARY = "A Python library for manipulating indices of ndarrays."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ae65fd258e03a8a2ef8e4af43d498474"

PYPI_PACKAGE = "ndindex"

inherit pypi python_setuptools_build_meta cython
SRC_URI[sha256sum] = "0f6113c1f031248f8818cbee1aa92aa3c9472b7701debcce9fddebcd2f610f11"

RDEPENDS:${PN} = "python3-numpy"

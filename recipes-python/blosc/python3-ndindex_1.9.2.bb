SUMMARY = "A Python library for manipulating indices of ndarrays."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ae65fd258e03a8a2ef8e4af43d498474"

PYPI_PACKAGE = "ndindex"

inherit pypi setuptools3 cython
SRC_URI[sha256sum] = "b8658a06e52d6c47445c2ec11d292e1d52c3af259214c8b52e3a1aab733daa72"

RDEPENDS:${PN} = "python3-numpy"

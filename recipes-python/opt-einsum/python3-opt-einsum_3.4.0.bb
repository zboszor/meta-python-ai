SUMMARY = "Path optimization of einsum functions"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5ab423c88cf3e69553decf93419f53ac"

DEPENDS = "python3-hatch-fancy-pypi-readme-native python3-hatch-vcs-native"

PYPI_PACKAGE = "opt_einsum"

inherit pypi python_hatchling cython

SRC_URI[sha256sum] = "96ca72f1b886d148241348783498194c577fa30a8faac108586b14f1ba4473ac"

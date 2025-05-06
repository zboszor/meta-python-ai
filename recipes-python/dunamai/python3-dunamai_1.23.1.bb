SUMMARY = "Dynamic version generation"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=059eed55dbfd3fea022510ea62c95dc1"

PYPI_PACKAGE = "dunamai"

inherit pypi python_poetry_core
SRC_URI[sha256sum] = "0b5712fc63bfb235263d912bfc5eb84590ba2201bb737268d25a5dbad7085489"

BBCLASSEXTEND = "native nativesdk"

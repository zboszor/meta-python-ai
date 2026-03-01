SUMMARY = "Dynamic version generation"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=059eed55dbfd3fea022510ea62c95dc1"

PYPI_PACKAGE = "dunamai"

inherit pypi python_poetry_core
SRC_URI[sha256sum] = "5396ac43aa20ed059040034e9f9798c7464cf4334c6fc3da3732e29273a2f97d"

BBCLASSEXTEND = "native nativesdk"

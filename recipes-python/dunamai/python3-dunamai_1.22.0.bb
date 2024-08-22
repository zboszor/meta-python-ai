SUMMARY = "Dynamic version generation"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=059eed55dbfd3fea022510ea62c95dc1"

PYPI_PACKAGE = "dunamai"

inherit pypi python_poetry_core
SRC_URI[sha256sum] = "375a0b21309336f0d8b6bbaea3e038c36f462318c68795166e31f9873fdad676"

BBCLASSEXTEND = "native nativesdk"

SUMMARY = "Dynamic version generation"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=059eed55dbfd3fea022510ea62c95dc1"

PYPI_PACKAGE = "dunamai"

inherit pypi python_poetry_core
SRC_URI[sha256sum] = "3aa3348f77242da8628b23f11e89569343440f0f912bcef32a1fa891cf8e7215"

BBCLASSEXTEND = "native nativesdk"

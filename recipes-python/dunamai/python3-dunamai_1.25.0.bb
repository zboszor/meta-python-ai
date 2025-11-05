SUMMARY = "Dynamic version generation"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=059eed55dbfd3fea022510ea62c95dc1"

PYPI_PACKAGE = "dunamai"

inherit pypi python_poetry_core
SRC_URI[sha256sum] = "a7f8360ea286d3dbaf0b6a1473f9253280ac93d619836ad4514facb70c0719d1"

BBCLASSEXTEND = "native nativesdk"

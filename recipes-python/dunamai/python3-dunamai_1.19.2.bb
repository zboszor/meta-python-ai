SUMMARY = "Dynamic version generation"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=059eed55dbfd3fea022510ea62c95dc1"

PYPI_PACKAGE = "dunamai"

inherit pypi python_poetry_core
SRC_URI[sha256sum] = "3be4049890763e19b8df1d52960dbea60b3e263eb0c96144a677ae0633734d2e"

BBCLASSEXTEND = "native nativesdk"

RDEPENDS:${PN} += " \
	python3-git \
"

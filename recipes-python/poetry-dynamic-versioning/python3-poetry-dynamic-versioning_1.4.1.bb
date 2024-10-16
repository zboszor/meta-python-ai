SUMMARY = "Easily serialize dataclasses to and from JSON"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=059eed55dbfd3fea022510ea62c95dc1"

PYPI_PACKAGE = "poetry_dynamic_versioning"

inherit pypi python_poetry_core
SRC_URI[sha256sum] = "21584d21ca405aa7d83d23d38372e3c11da664a8742995bdd517577e8676d0e1"

BBCLASSEXTEND = "native nativesdk"

RDEPENDS:${PN} += " \
	python3-dunamai \
	python3-jinja2 \
	python3-tomlkit \
"

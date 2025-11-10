SUMMARY = "Easily serialize dataclasses to and from JSON"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=059eed55dbfd3fea022510ea62c95dc1"

PYPI_PACKAGE = "poetry_dynamic_versioning"

inherit pypi python_poetry_core
SRC_URI[sha256sum] = "d6e7b9df817aa2ca4946cd695c6c89e1379d2e6c640f008a9b6170d081a9da48"

BBCLASSEXTEND = "native nativesdk"

RDEPENDS:${PN} += " \
	python3-dunamai \
	python3-jinja2 \
	python3-tomlkit \
"

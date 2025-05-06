SUMMARY = "Easily serialize dataclasses to and from JSON"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=059eed55dbfd3fea022510ea62c95dc1"

PYPI_PACKAGE = "poetry_dynamic_versioning"

inherit pypi python_poetry_core
SRC_URI[sha256sum] = "d14de13d426ac28e98f4519aac7f4aa857e7b97ad9d7a4c72293377033065f44"

BBCLASSEXTEND = "native nativesdk"

RDEPENDS:${PN} += " \
	python3-dunamai \
	python3-jinja2 \
	python3-tomlkit \
"

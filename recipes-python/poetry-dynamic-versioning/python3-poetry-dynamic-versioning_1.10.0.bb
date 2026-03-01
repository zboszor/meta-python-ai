SUMMARY = "Easily serialize dataclasses to and from JSON"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=059eed55dbfd3fea022510ea62c95dc1"

PYPI_PACKAGE = "poetry_dynamic_versioning"

inherit pypi python_poetry_core
SRC_URI[sha256sum] = "52bf9ed57f2d60f4250a1dfe43db7b8144541df2f3ae6e712d12b43ecda71f47"

BBCLASSEXTEND = "native nativesdk"

RDEPENDS:${PN} += " \
	python3-dunamai \
	python3-jinja2 \
	python3-tomlkit \
"

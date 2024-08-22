SUMMARY = "Easily serialize dataclasses to and from JSON"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=059eed55dbfd3fea022510ea62c95dc1"

PYPI_PACKAGE = "poetry_dynamic_versioning"

inherit pypi python_poetry_core
SRC_URI[sha256sum] = "725178bd50a22f2dd4035de7f965151e14ecf8f7f19996b9e536f4c5559669a7"

BBCLASSEXTEND = "native nativesdk"

RDEPENDS:${PN} += " \
	python3-dunamai \
	python3-jinja2 \
	python3-tomlkit \
"

SUMMARY = "Easily serialize dataclasses to and from JSON"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0c1876b666ebd26c12461357f868c812"

PYPI_PACKAGE = "dataclasses_json"

inherit pypi python_poetry_core

SRC_URI[sha256sum] = "b6b3e528266ea45b9535223bc53ca645f5208833c29229e847b3f26a1cc55fc0"

DEPENDS += "python3-poetry-dynamic-versioning-native"

RDEPENDS:${PN} = " \
	python3-marshmallow \
	python3-typing-inspect \
"

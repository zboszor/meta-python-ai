SUMMARY = "Runtime inspection utilities for typing module"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=38939e40df14ccacab135b023198167a"

PYPI_PACKAGE = "typing_inspect"

inherit pypi python_poetry_core

SRC_URI[sha256sum] = "b23fc42ff6f6ef6954e4852c1fb512cdd18dbea03134f91f856a95ccc9461f78"

DEPENDS += " \
	python3-typing-extensions-native \
	python3-mypy-extensions-native \
"

RDEPENDS:${PN} = " \
	python3-typing-extensions \
	python3-mypy-extensions \
"

SUMMARY = "Easily serialize dataclasses to and from JSON"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0c1876b666ebd26c12461357f868c812"

PYPI_PACKAGE = "dataclasses_json"

inherit pypi python_poetry_core

SRC_URI[sha256sum] = "d82896a94c992ffaf689cd1fafc180164e2abdd415b8f94a7f78586af5886236"

RDEPENDS:${PN} = " \
	python3-marshmallow \
	python3-typing-inspect \
"

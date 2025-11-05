SUMMARY = "An easy safelist-based HTML-sanitizing tool."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=adea50d072dac455e5a50a518e2d01aa"

PYPI_PACKAGE = "bleach"

inherit pypi setuptools3
SRC_URI[sha256sum] = "6f3b91b1c0a02bb9a78b5a454c92506aa0fdf197e1d5e114d2e00c6f64306d22"

RDEPENDS:${PN} = " \
	bash \
	python3-webencodings \
	python3-tinycss2 \
"

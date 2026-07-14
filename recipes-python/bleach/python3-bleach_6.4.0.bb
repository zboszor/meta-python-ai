SUMMARY = "An easy safelist-based HTML-sanitizing tool."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=adea50d072dac455e5a50a518e2d01aa"

PYPI_PACKAGE = "bleach"

inherit pypi setuptools3
SRC_URI[sha256sum] = "4202482733d85cedd04e59fcb2f89f4e4c7c385a78d3c3c23c30446843a37452"

RDEPENDS:${PN} = " \
	bash \
	python3-webencodings \
	python3-tinycss2 \
"

SUMMARY = "An easy safelist-based HTML-sanitizing tool."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=adea50d072dac455e5a50a518e2d01aa"

PYPI_PACKAGE = "bleach"

inherit pypi setuptools3
SRC_URI[sha256sum] = "123e894118b8a599fd80d3ec1a6d4cc7ce4e5882b1317a7e1ba69b56e95f991f"

RDEPENDS:${PN} = " \
	bash \
	python3-webencodings \
	python3-tinycss2 \
"

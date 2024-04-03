SUMMARY = "An easy safelist-based HTML-sanitizing tool."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=adea50d072dac455e5a50a518e2d01aa"

PYPI_PACKAGE = "bleach"

inherit pypi setuptools3
SRC_URI[sha256sum] = "0a31f1837963c41d46bbf1331b8778e1308ea0791db03cc4e7357b97cf42a8fe"

RDEPENDS:${PN} = " \
	bash \
	python3-six \
	python3-webencodings \
	python3-tinycss2 \
"

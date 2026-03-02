PV = "14.3.3"
SRC_URI[sha256sum] = "b8daa0b9e4eef54dd8cf7c86c03713f53241884e814f4e2f5fb342fe520f639b"

RDEPENDS:${PN}:remove = " \
	python3-html \
	python3-image \
	python3-unixadmin \
"

RDEPENDS:${PN}:append = " \
	python3-pygments \
	python3-markdown-it-py \
"

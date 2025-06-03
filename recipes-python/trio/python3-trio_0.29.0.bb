SUMMARY = "WebSocket library for Trio"
LICENSE = "MIT | Apache-2.0"
LIC_FILES_CHKSUM = " \
	file://LICENSE.MIT;md5=5f229c828e5a6f0a2ce90c7d3c054721 \
	file://LICENSE.APACHE2;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

PYPI_PACKAGE = "trio"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "ea0d3967159fc130acb6939a0be0e558e364fee26b5deeecc893a6b08c361bdf"

RDEPENDS:${PN} = " \
	python3-attrs \
	python3-sortedcontainers \
	python3-idna \
	python3-outcome \
	python3-sniffio \
	python3-cffi \
"

BBCLASSEXTEND = "native nativesdk"

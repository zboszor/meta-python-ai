SUMMARY = "Aiohttp transport for HTTPX"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6cd99a559ccce444ec3f9ef9d16f9e87"
DEPENDS = "python3-hatch-fancy-pypi-readme-native"

PYPI_PACKAGE = "httpx_aiohttp"

inherit pypi python_hatchling
SRC_URI[sha256sum] = "81feec51fd82c0ecfa0e9aaf1b1a6c2591260d5e2bcbeb7eb0277a78e610df2c"

RDEPENDS:${PN} = " \
	python3-aiohttp \
	python3-httpx \
"

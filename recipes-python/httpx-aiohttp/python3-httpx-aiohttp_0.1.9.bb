SUMMARY = "Aiohttp transport for HTTPX"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6cd99a559ccce444ec3f9ef9d16f9e87"
DEPENDS = "python3-hatch-fancy-pypi-readme-native"

PYPI_PACKAGE = "httpx_aiohttp"

inherit pypi python_hatchling
SRC_URI[sha256sum] = "4ee8b22e6f2e7c80cd03be29eff98bfe7d89bd77f021ce0b578ee76b73b4bfe6"

RDEPENDS:${PN} = " \
	python3-aiohttp \
	python3-httpx \
"

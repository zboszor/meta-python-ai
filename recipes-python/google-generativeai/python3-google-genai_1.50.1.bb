SUMMARY = "GenAI Python SDK"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS = "python3-twine-native python3-pkginfo-native"

PYPI_PACKAGE = "google_genai"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "8f0d95b1b165df71e6a7e1c0d0cadb5fad30f913f42c6b131b9ebb504eec0e5f"

RDEPENDS:${PN} = " \
	python3-anyio \
	python3-google-auth \
	python3-httpx \
	python3-pydantic \
	python3-requests \
	python3-tenacity \
	python3-websockets \
	python3-typing-extensions \
	python3-aiohttp \
	python3-sentencepiece \
	python3-protobuf \
"

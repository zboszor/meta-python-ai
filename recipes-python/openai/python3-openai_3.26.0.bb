SUMMARY = "The official Python library for the openai API"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0ea6c924de5bc3823bdb7280ae3096c1"

PYPI_PACKAGE = "openai"

inherit pypi python_hatchling
SRC_URI[sha256sum] = "73b470c09cf2171dce930e36af01c6632241adda0120ad84302ad229f9130a5a"

SRC_URI += "file://unversioned-hatchling.patch"

RDEPENDS:${PN} = " \
	python3-httpx2 \
	python3-pydantic \
	python3-typing-extensions \
	python3-anyio \
	python3-sniffio \
	python3-jiter \
	python3-aiohttp \
	python3-websockets \
	python3-numpy \
	python3-pandas \
	python3-pandas-stubs \
"

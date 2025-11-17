SUMMARY = "The official Python library for the openai API"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=12a41f933031444ece1dced21d6a9efb"
DEPENDS = "python3-hatch-fancy-pypi-readme-native"

PYPI_PACKAGE = "openai"

inherit pypi python_hatchling
SRC_URI[sha256sum] = "4851908f6d6fcacbd47ba659c5ac084f7725b752b6bfa1e948b6fbfc111a6bad"

SRC_URI += "file://unversioned-hatchling.patch"

RDEPENDS:${PN} = " \
	python3-httpx \
	python3-pydantic \
	python3-typing-extensions \
	python3-anyio \
	python3-distro \
	python3-sniffio \
	python3-tqdm \
	python3-jiter \
	python3-aiohttp \
	python3-httpx-aiohttp \
	python3-websockets \
	python3-numpy \
	python3-pandas \
	python3-pandas-stubs \
"

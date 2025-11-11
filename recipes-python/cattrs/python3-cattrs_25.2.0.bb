SUMMARY = "Composable complex class support for attrs and dataclasses."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=12efd5ce6c6c43c4ead370bd15f93560"

DEPENDS = "python3-hatch-vcs-native"

PYPI_PACKAGE = "cattrs"

inherit pypi python_hatchling
SRC_URI[sha256sum] = "f46c918e955db0177be6aa559068390f71988e877c603ae2e56c71827165cc06"

RDEPENDS:${PN} = " \
	python3-attrs \
	python3-typing-extensions \
	python3-ujson \
	python3-orjson \
	python3-msgpack \
	python3-pyyaml \
	python3-tomlkit \
	python3-cbor2 \
	python3-pymongo \
	python3-bson \
	python3-msgspec \
"

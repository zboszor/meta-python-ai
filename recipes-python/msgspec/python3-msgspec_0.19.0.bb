SUMMARY = "A fast serialization and validation library, with builtin support for JSON, MessagePack, YAML, and TOML."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c21402f8022478021f697044388b97c4"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "604037e7cd475345848116e89c553aa9a233259733ab51986ac924ab1b976f8e"

RDEPENDS:${PN} = " \
	python3-pyyaml \
	python3-tomli \
	python3-tomli-w \
"

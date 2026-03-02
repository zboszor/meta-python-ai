SUMMARY = "A fast serialization and validation library, with builtin support for JSON, MessagePack, YAML, and TOML."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c21402f8022478021f697044388b97c4"

DEPENDS = "python3-setuptools-scm-native"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "692349e588fde322875f8d3025ac01689fead5901e7fb18d6870a44519d62a29"

RDEPENDS:${PN} = " \
	python3-pyyaml \
	python3-tomli \
	python3-tomli-w \
"

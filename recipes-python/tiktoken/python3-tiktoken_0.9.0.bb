SUMMARY = "tiktoken is a fast BPE tokeniser for use with OpenAI's models"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3794f392e777e4fdf460d9bad404803"
DEPENDS = "python3-setuptools-rust-native"

PYPI_PACKAGE = "tiktoken"

S = "${WORKDIR}/${PYPI_PACKAGE}-${PV}"

inherit pypi cargo-update-recipe-crates python_setuptools3_rust
SRC_URI[sha256sum] = "d02a5ca6a938e0490e1ff957bc48c8b078c88cb83977be1625b1fd8aac792c5d"

SRC_URI += "file://Cargo.lock.patch"

require ${BPN}-crates.inc

RDEPENDS:${PN} = " \
	python3-regex \
	python3-requests \
	python3-blobfile \
"

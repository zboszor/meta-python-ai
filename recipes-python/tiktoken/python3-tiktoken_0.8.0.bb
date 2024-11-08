SUMMARY = "tiktoken is a fast BPE tokeniser for use with OpenAI's models"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3794f392e777e4fdf460d9bad404803"
DEPENDS = "python3-setuptools-rust-native"

PYPI_PACKAGE = "tiktoken"

S = "${WORKDIR}/${PYPI_PACKAGE}-${PV}"

inherit pypi cargo-update-recipe-crates python_setuptools3_rust
SRC_URI[sha256sum] = "9ccbb2740f24542534369c5635cfd9b2b3c2490754a78ac8831d99f89f94eeb2"

SRC_URI += "file://Cargo.lock.patch"

require ${BPN}-crates.inc

RDEPENDS:${PN} = " \
	python3-regex \
	python3-requests \
	python3-blobfile \
"

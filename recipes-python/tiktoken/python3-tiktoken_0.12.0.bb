SUMMARY = "tiktoken is a fast BPE tokeniser for use with OpenAI's models"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3794f392e777e4fdf460d9bad404803"
DEPENDS = "python3-setuptools-rust-native"

PYPI_PACKAGE = "tiktoken"

inherit pypi cargo-update-recipe-crates python_pyo3 python_setuptools3_rust
SRC_URI[sha256sum] = "b18ba7ee2b093863978fcb14f74b3707cdc8d4d4d3836853ce7ec60772139931"

SRC_URI += "file://Cargo.lock.patch"

require ${BPN}-crates.inc

RDEPENDS:${PN} = " \
	python3-regex \
	python3-requests \
	python3-blobfile \
"

SUMMARY = "Low level implementations for computer vision in Rust"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"
DEPENDS = " \
	nasm-native \
	python3-pytorch-native \
	python3-pytorch \
	python3-numpy-native \
	python3-numpy \
"

PYPI_PACKAGE = "kornia_rs"

require ${BPN}-crates.inc

inherit pypi cargo-update-recipe-crates python3native rust python_maturin

SRC_URI[sha256sum] = "5fd3fbc65240fa751975f5870b079f98e7fdcaa2885ea577b3da324d8bf01d81"

#export CARGO_PROFILE_RELEASE_BUILD_OVERRIDE_DEBUG = "true"

RDEPENDS:${PN} = " \
	python3-pytorch \
	python3-numpy \
"

INSANE_SKIP:${PN}-dbg += "buildpaths"

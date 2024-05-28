SUMMARY = "Low level implementations for computer vision in Rust"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"
DEPENDS = " \
	python3-pytorch-native \
	python3-pytorch \
	python3-numpy-native \
	python3-numpy \
"

PYPI_PACKAGE = "kornia_rs"

require ${BPN}-crates.inc

inherit pypi cargo-update-recipe-crates python3native rust python_maturin

SRC_URI[sha256sum] = "e299d110774fc10f82c547fb04b1b8bf450a0514010324e7be06206d2179ceaf"

SRC_URI += "file://0009-Remove-built.patch;patchdir=${WORKDIR}/cargo_home/bitbake/rav1e-0.7.1"

export CARGO_PROFILE_RELEASE_BUILD_OVERRIDE_DEBUG = "true"

RDEPENDS:${PN} = " \
	python3-pytorch \
	python3-numpy \
"

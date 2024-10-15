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

SRC_URI[sha256sum] = "00520988740e9de1682f2f682caecb9b740d2489f3fbbb1ca0b6fc56af70d298"

SRC_URI += "file://0009-Remove-built.patch;patchdir=${UNPACKDIR}/cargo_home/bitbake/rav1e-0.7.1"

export CARGO_PROFILE_RELEASE_BUILD_OVERRIDE_DEBUG = "true"

RDEPENDS:${PN} = " \
	python3-pytorch \
	python3-numpy \
"

INSANE_SKIP:${PN}-dbg += "buildpaths"

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

SRC_URI[sha256sum] = "c7e45e84eb3c2454055326f86329e48a68743507460fb7e39315397fa6eeb9a0"

SRC_URI += " \
	file://kornia-rs-src.tar.gz;destsuffix=${UNPACKDIR} \
	file://0009-Remove-built.patch;patchdir=${UNPACKDIR}/cargo_home/bitbake/rav1e-0.7.1 \
"

export CARGO_PROFILE_RELEASE_BUILD_OVERRIDE_DEBUG = "true"

do_configure:prepend () {
	ln -s ${UNPACKDIR}/kornia-py/src ${S}/kornia-py/src
}

RDEPENDS:${PN} = " \
	python3-pytorch \
	python3-numpy \
"

INSANE_SKIP:${PN}-dbg += "buildpaths"

SUMMARY = "Good compression for numerical sequences"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=fe0561212c0fcaf3fcb34e743a879d78"

DEPENDS = "python3-numpy-native python3-numpy"

require ${BPN}-crates.inc

inherit pypi cargo-update-recipe-crates python3native rust python_maturin
SRC_URI[sha256sum] = "300e6dd9afe5c24b1c40724ff0b8bcac2f03a443cd94b3068e4c301dcd5f45f0"

RDEPENDS:${PN} = "python3-numpy"

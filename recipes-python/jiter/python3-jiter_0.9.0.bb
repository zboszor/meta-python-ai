SUMMARY = "Fast iterable JSON parser."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=8bf28b24c0553e1be2274bde462924dd"

PYPI_PACKAGE = "jiter"

require ${BPN}-crates.inc

inherit pypi cargo-update-recipe-crates python3native rust python_maturin

SRC_URI[sha256sum] = "aadba0964deb424daa24492abc3d229c60c4a31bfee205aedbf1acc7639d7893"

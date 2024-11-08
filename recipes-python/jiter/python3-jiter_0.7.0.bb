SUMMARY = "Fast iterable JSON parser."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=0dce4c0ecc7aadf8bb4c77233cf31f76"

PYPI_PACKAGE = "jiter"

require ${BPN}-crates.inc

inherit pypi cargo-update-recipe-crates python3native rust python_maturin

SRC_URI[sha256sum] = "c061d9738535497b5509f8970584f20de1e900806b239a39a9994fc191dad630"

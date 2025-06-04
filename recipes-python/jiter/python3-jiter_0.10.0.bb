SUMMARY = "Fast iterable JSON parser."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=8c977af68269bc1a42dfc572470e69e1"

PYPI_PACKAGE = "jiter"

require ${BPN}-crates.inc

inherit pypi cargo-update-recipe-crates python3native rust python_maturin

SRC_URI[sha256sum] = "07a7142c38aacc85194391108dc91b5b57093c978a9932bd86a36862759d9500"

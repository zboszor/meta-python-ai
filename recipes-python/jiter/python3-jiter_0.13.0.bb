SUMMARY = "Fast iterable JSON parser."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aa97bb3778992892e226b4504b83b60c"

PYPI_PACKAGE = "jiter"

require ${BPN}-crates.inc

inherit pypi cargo-update-recipe-crates python3native rust python_maturin

SRC_URI[sha256sum] = "f2839f9c2c7e2dffc1bc5929a510e14ce0a946be9365fd1219e7ef342dae14f4"

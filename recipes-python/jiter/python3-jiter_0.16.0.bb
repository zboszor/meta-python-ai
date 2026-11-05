SUMMARY = "Fast iterable JSON parser."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aa97bb3778992892e226b4504b83b60c"

PYPI_PACKAGE = "jiter"

require ${BPN}-crates.inc

inherit pypi cargo-update-recipe-crates python3native rust python_maturin

SRC_URI[sha256sum] = "7b24c3492c5f4f84a37946ad9cf504910cf6a782d6a4e0689b6673c5894b4a1c"

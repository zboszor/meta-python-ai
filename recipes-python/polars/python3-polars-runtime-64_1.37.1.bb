SUMMARY = "Blazingly fast DataFrame library (64-bit runtime)"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fc1b8a73cb6b324d8260f0771a4a0e71"

PYPI_PACKAGE = "polars_runtime_64"

inherit pypi python_maturin cargo-update-recipe-crates python3native

SRC_URI[sha256sum] = "5ae00e40de7ce737b759f210703af31dad3cadfd04e6b6bb4932c5acef61e07c"
SRC_URI += "file://0001-polars-runtime-64-Don-t-use-nightly-build.patch"

require ${BPN}-crates.inc

do_compile[network] = "1"

INSANE_SKIP:${PN}-dbg = "buildpaths"

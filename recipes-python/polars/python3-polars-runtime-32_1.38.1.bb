SUMMARY = "Blazingly fast DataFrame library (32-bit runtime)"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fc1b8a73cb6b324d8260f0771a4a0e71"

PYPI_PACKAGE = "polars_runtime_32"

inherit pypi python_maturin cargo-update-recipe-crates python3native

SRC_URI[sha256sum] = "04f20ed1f5c58771f34296a27029dc755a9e4b1390caeaef8f317e06fdfce2ec"
SRC_URI += "file://0001-polars-runtime-32-Don-t-use-nightly-build.patch"

require ${BPN}-crates.inc

do_compile[network] = "1"

INSANE_SKIP:${PN}-dbg = "buildpaths"

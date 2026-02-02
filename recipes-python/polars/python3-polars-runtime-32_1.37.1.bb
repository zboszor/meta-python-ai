SUMMARY = "Blazingly fast DataFrame library (32-bit runtime)"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fc1b8a73cb6b324d8260f0771a4a0e71"

PYPI_PACKAGE = "polars_runtime_32"

inherit pypi python_maturin cargo-update-recipe-crates python3native

SRC_URI[sha256sum] = "68779d4a691da20a5eb767d74165a8f80a2bdfbde4b54acf59af43f7fa028d8f"
SRC_URI += "file://0001-polars-runtime-32-Don-t-use-nightly-build.patch"

require ${BPN}-crates.inc

do_compile[network] = "1"

INSANE_SKIP:${PN}-dbg = "buildpaths"

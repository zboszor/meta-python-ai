SUMMARY = "Blazingly fast DataFrame library (64-bit runtime)"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6669f501d05823808d9d97d0498d9be"

PYPI_PACKAGE = "polars_runtime_64"

inherit pypi python_maturin cargo-update-recipe-crates python3native pkgconfig

SRC_URI[sha256sum] = "9d0aa1ba0ed4521203c1c2aa44c279809427305577583d57715f06c708011122"
SRC_URI += "file://0001-polars-runtime-64-Don-t-use-nightly-build.patch"

require ${BPN}-crates.inc

do_compile[network] = "1"

INSANE_SKIP:${PN}-dbg = "buildpaths"

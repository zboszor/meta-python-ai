SUMMARY = "Python binding to Ammonia HTML sanitizer Rust crate"
DESCRIPTION = "Python binding to Ammonia HTML sanitizer Rust crate"
HOMEPAGE = "https://github.com/messense/nh3"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1095f9c2128d0f3bb8d88f92e25dd639"

SRC_URI[sha256sum] = "185ed41b88c910b9ca8edc89ca3b4be688a12cb9de129d84befa2f74a0039fee"

inherit pypi cargo-update-recipe-crates python_maturin

require ${BPN}-crates.inc

BBCLASSEXTEND = "native nativesdk"

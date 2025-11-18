SUMMARY = "Python binding to Ammonia HTML sanitizer Rust crate"
DESCRIPTION = "Python binding to Ammonia HTML sanitizer Rust crate"
HOMEPAGE = "https://github.com/messense/nh3"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1095f9c2128d0f3bb8d88f92e25dd639"

SRC_URI[sha256sum] = "f394759a06df8b685a4ebfb1874fb67a9cbfd58c64fc5ed587a663c0e63ec376"

inherit pypi cargo-update-recipe-crates python_maturin

require ${BPN}-crates.inc

BBCLASSEXTEND = "native nativesdk"

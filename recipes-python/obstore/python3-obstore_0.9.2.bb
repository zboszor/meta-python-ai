SUMMARY = "The simplest, highest-throughput Python interface to Amazon S3, Google Cloud Storage, Azure Storage, & other S3-compliant APIs, powered by Rust."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=a24a7547ac2f0703e4d0d57ba5336440"

DEPENDS = "python3-hatch-vcs-native"

PYPI_PACKAGE = "obstore"

inherit pypi cargo-update-recipe-crates python_maturin
SRC_URI[sha256sum] = "7ef94323127a971c9dea2484109d6c706eb2b2594a2df13c2dd0a6d21a9a69ae"

require ${BPN}-crates.inc

# cargo-update-recipe-crates does not handle git+https:// in Cargo.lock
# obstore needs these:
# git+https://github.com/alex/pyo3-file
# git+https://github.com/apache/arrow-rs-object-store
do_compile[network] = "1"

INSANE_SKIP:${PN} = "already-stripped"

SUMMARY = "The simplest, highest-throughput Python interface to Amazon S3, Google Cloud Storage, Azure Storage, & other S3-compliant APIs, powered by Rust."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=c85d55b67beebcbfa9d5568273758bce"

DEPENDS = "python3-hatch-vcs-native"

PYPI_PACKAGE = "obstore"

inherit pypi cargo-update-recipe-crates python_maturin
SRC_URI[sha256sum] = "a467bc4e97169e2ba749981b4fd0936015428d9b8f3fb83a5528536b1b6f377f"

require ${BPN}-crates.inc

# cargo-update-recipe-crates does not handle git+https:// in Cargo.lock
# obstore needs these:
# git+https://github.com/alex/pyo3-file
# git+https://github.com/apache/arrow-rs-object-store
do_compile[network] = "1"

RDEPENDS:${PN} = " \
	python3-typing-extensions \
"

INSANE_SKIP:${PN} = "already-stripped"

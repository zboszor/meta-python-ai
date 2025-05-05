SUMMARY = "Good compression for numerical sequences"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=753719fbde36530f60f37dc1e770de63"

DEPENDS = "python3-numpy-native python3-numpy"

require ${BPN}-crates.inc

inherit pypi cargo-update-recipe-crates python3native rust python_maturin
SRC_URI[sha256sum] = "759505b08db98a28ef8964b23044cc73b137df133d5b07225a6c8ee9540286bf"

RDEPENDS:${PN} = "python3-numpy"

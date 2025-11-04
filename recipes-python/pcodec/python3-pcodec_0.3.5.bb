SUMMARY = "Good compression for numerical sequences"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=9ab25aa554d5ad53024a650f96582705"

DEPENDS = "python3-numpy-native python3-numpy"

require ${BPN}-crates.inc

inherit pypi cargo-update-recipe-crates python3native rust python_maturin
SRC_URI[sha256sum] = "d0242d3cabfd82cbd3d4d1f83a71aba92273a49972a372f39ca3eb20db12861d"

RDEPENDS:${PN} = "python3-numpy"

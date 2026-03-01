SUMMARY = "Good compression for numerical sequences"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=a3a3c580055688c00a17d96154631b71"

DEPENDS = "python3-numpy-native python3-numpy"

require ${BPN}-crates.inc

inherit pypi cargo-update-recipe-crates python3native rust python_maturin
SRC_URI[sha256sum] = "559112623ae9ffb42f9f3fdffb5b0cb27d5c363b104994e66a6c0f1093e2de83"

RDEPENDS:${PN} = "python3-numpy"

SUMMARY = "Simple color conversion and perceptual (DeltaE CIE 2000) difference"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=b6eab716e07c22af9e4a2a50dd39222e"

DEPENDS = "python3-uv-build-native"

PYPI_PACKAGE = "basic_colormath"

inherit pypi python_flit_core
SRC_URI[sha256sum] = "6c235d7baafd3e1c0c775ddea1b7f2325a51e46d13edded571f242e443897ea6"
SRC_URI += "file://relay-uv-build-dep.patch"

RDEPENDS:${PN} = "python3-numpy"

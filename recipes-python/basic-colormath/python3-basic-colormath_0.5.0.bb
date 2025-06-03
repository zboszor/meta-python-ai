SUMMARY = "Simple color conversion and perceptual (DeltaE CIE 2000) difference"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=b1613499de5a83820e5ee1d78295bd20"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "basic_colormath"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "a7fb8db8d83992a28891e3265f9b1663cba6180834138fe8b6043187322ea341"

RDEPENDS:${PN} = "python3-numpy"

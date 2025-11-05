SUMMARY = "Simple color conversion and perceptual (DeltaE CIE 2000) difference"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7bed31419709841f52389568dd4a2c6f"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "basic_colormath"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "597d9ed3a7abfec65b842b4e6152c8434141d51a2266fd04ecc5f2ef10f1c59b"

RDEPENDS:${PN} = "python3-numpy"

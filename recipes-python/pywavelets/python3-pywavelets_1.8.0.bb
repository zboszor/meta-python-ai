SUMMARY = "PyWavelets, wavelet transform module"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8acfa576998385b0a0df529d6db9ac38 \
	file://LICENSES_bundled.txt;md5=ad7a2d94bb7977b2937292e1a08fe0d3"

DEPENDS = "python3-numpy-native"

PYPI_PACKAGE = "pywavelets"

inherit pypi pkgconfig python_mesonpy cython
SRC_URI[sha256sum] = "f3800245754840adc143cbc29534a1b8fc4b8cff6e9d403326bd52b7bb5c35aa"

SRC_URI += "file://build-fixes.patch"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-scipy \
"

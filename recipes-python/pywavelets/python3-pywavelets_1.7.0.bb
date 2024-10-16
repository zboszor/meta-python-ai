SUMMARY = "PyWavelets, wavelet transform module"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8acfa576998385b0a0df529d6db9ac38 \
	file://LICENSES_bundled.txt;md5=ad7a2d94bb7977b2937292e1a08fe0d3"

DEPENDS = "python3-numpy-native python3-cython-native"

PYPI_PACKAGE = "pywavelets"

inherit pypi pkgconfig python_mesonpy
SRC_URI[sha256sum] = "b47250e5bb853e37db5db423bafc82847f4cde0ffdf7aebb06336a993bc174f6"

SRC_URI += "file://build-fixes.patch"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-matplotlib \
	python3-scipy \
"

SUMMARY = "PyWavelets, wavelet transform module"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8acfa576998385b0a0df529d6db9ac38 \
	file://LICENSES_bundled.txt;md5=ad7a2d94bb7977b2937292e1a08fe0d3"

DEPENDS = "python3-numpy-native python3-cython-native"

PYPI_PACKAGE = "pywavelets"

inherit pypi python_mesonpy
SRC_URI[sha256sum] = "ea027c70977122c5fc27b2510f0a0d9528f9c3df6ea3e4c577ca55fd00325a5b"

SRC_URI += "file://build-fixes.patch"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-matplotlib \
	python3-scipy \
"

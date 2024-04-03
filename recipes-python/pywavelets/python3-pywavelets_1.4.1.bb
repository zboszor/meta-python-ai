SUMMARY = "PyWavelets, wavelet transform module"
LICENSE = "MIT & BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8acfa576998385b0a0df529d6db9ac38 \
	file://LICENSES_bundled.txt;md5=7e546101065fe4e7f7cb9510adb80f8f"

DEPENDS = "python3-numpy-native python3-cython-native"

PYPI_PACKAGE = "PyWavelets"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "6437af3ddf083118c26d8f97ab43b0724b956c9f958e9ea788659f6a2834ba93"

SRC_URI += "file://toml-fixes.patch"

export USE_C99_COMPLEX = "1"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-matplotlib \
	python3-scipy \
"

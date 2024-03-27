SUMMARY = "Blosc data compressor"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c85efbeab0f2615b3ad9248098eed28f"

DEPENDS = " \
	python3-scikit-build-native python3-numpy-native \
	ninja-native python3-ninja-native \
	cmake-native python3-cmake-native \
	python3-py-cpuinfo-native \
	blosc \
"

PYPI_PACKAGE = "blosc"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "c22119b27bae1063a697f639028b422d55811b0880c3fc0149cbdea791d0b276"

export USE_SYSTEM_BLOSC = "1"

RDEPENDS:${PN} = "python3-numpy"

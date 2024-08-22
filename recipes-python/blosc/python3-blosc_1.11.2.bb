SUMMARY = "Blosc data compressor"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=baedf3dcd9937dd23bd308286702c89c"

DEPENDS = " \
	python3-scikit-build-native python3-numpy-native \
	ninja-native python3-ninja-native \
	cmake-native python3-cmake-native \
	python3-py-cpuinfo-native \
	blosc \
"

PYPI_PACKAGE = "blosc"

inherit cmake pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "ac5e7c1bfc1c7232b900be94cddb5ffcf9ea49f313c8ae98a7ca0dd87b872bf4"

export CMAKE_TOOLCHAIN_FILE="${WORKDIR}/toolchain.cmake"

export USE_SYSTEM_BLOSC = "1"
export Blosc_INCLUDE_DIR = "${STAGING_INCDIR}"
export Blosc_LIBRARY = "${STAGING_LIBDIR}"

RDEPENDS:${PN} = "python3-numpy"

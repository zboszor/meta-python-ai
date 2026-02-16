SUMMARY = "lightweight wrapper around basic LLVM functionality"
LICENSE = "BSD-2-Clause & Apache-2.0-with-LLVM-exception"
LIC_FILES_CHKSUM = " \
	file://LICENSE;md5=57c7cdf8c8d2dcbc7528fe68e52b3a17 \
	file://LICENSE.thirdparty;md5=6942af3a9e3217451aceefd9432a6398"

DEPENDS = "clang20-native clang20"

PYPI_PACKAGE = "llvmlite"

inherit pypi cmake setuptools3

SRC_URI[sha256sum] = "227c9fd6d09dce2783c18b754b7cd9d9b3b3515210c46acc2d3c5badd9870ceb"

CXXFLAGS += "-I${STAGING_INCDIR}/${PYTHON_DIR}"

export CMAKE_ARGS = "-DCMAKE_TOOLCHAIN_FILE=${WORKDIR}/toolchain.cmake"

BBCLASSEXTEND = "native"

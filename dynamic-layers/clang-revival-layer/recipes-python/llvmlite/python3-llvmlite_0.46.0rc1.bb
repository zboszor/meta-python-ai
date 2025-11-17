SUMMARY = "lightweight wrapper around basic LLVM functionality"
LICENSE = "BSD-2-Clause & Apache-2.0-with-LLVM-exception"
LIC_FILES_CHKSUM = " \
	file://LICENSE;md5=57c7cdf8c8d2dcbc7528fe68e52b3a17 \
	file://LICENSE.thirdparty;md5=6942af3a9e3217451aceefd9432a6398"

DEPENDS = "clang20-native clang20"

PYPI_PACKAGE = "llvmlite"

inherit pypi cmake setuptools3

SRC_URI[sha256sum] = "fc84f9124ccbc0985461fd8ac489388b146dfa6d9faa8ed41013ad9b01ac0152"

CXXFLAGS += "-I${STAGING_INCDIR}/${PYTHON_DIR}"

export CMAKE_ARGS = "-DCMAKE_TOOLCHAIN_FILE=${WORKDIR}/toolchain.cmake"

BBCLASSEXTEND = "native"

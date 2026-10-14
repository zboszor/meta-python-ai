SUMMARY = "lightweight wrapper around basic LLVM functionality"
LICENSE = "BSD-2-Clause & Apache-2.0-with-LLVM-exception"
LIC_FILES_CHKSUM = " \
	file://LICENSE;md5=57c7cdf8c8d2dcbc7528fe68e52b3a17 \
	file://LICENSE.thirdparty;md5=6942af3a9e3217451aceefd9432a6398"

DEPENDS = "clang-native clang"

PYPI_PACKAGE = "llvmlite"

inherit pypi cmake setuptools3

SRC_URI[sha256sum] = "543b19f9ef8f3c7c60d1468191e4ee1b1537bf9f8a3d56f64c0ddd98de92edd2"

CXXFLAGS += "-I${STAGING_INCDIR}/${PYTHON_DIR}"

export CMAKE_ARGS = "-DCMAKE_TOOLCHAIN_FILE=${WORKDIR}/toolchain.cmake"

BBCLASSEXTEND = "native"

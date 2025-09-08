SUMMARY = "lightweight wrapper around basic LLVM functionality"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a15ea9843f27327e08f3c5fbf8043a2b"

DEPENDS = "clang"

PYPI_PACKAGE = "llvmlite"
PYPI_SEMVER_SUFFIX = "rc1"
PYPI_PACKAGE_EXT = "tar.gz"
PYPI_ARCHIVE_NAME = "${PYPI_PACKAGE}-${PV}${PYPI_SEMVER_SUFFIX}.${PYPI_PACKAGE_EXT}"
PR = "${@ 'r1' if d.getVar('PYPI_SEMVER_SUFFIX') == '' else 'r0.'+d.getVar('PYPI_SEMVER_SUFFIX') }"

SRC_URI = "https://files.pythonhosted.org/packages/source/l/${PYPI_PACKAGE}/${PYPI_ARCHIVE_NAME}"

S = "${UNPACKDIR}/${PYPI_PACKAGE}-${PV}${PYPI_SEMVER_SUFFIX}"

inherit cmake setuptools3

SRC_URI[sha256sum] = "bec0a4c729848a4e7f6355fdbd98f2ee9471189d0a5aeb03a3cd19f672327fef"

CXXFLAGS += "-I${STAGING_INCDIR}/${PYTHON_DIR}"

CMAKE_TOOLCHAIN_FILE = "${WORKDIR}/toolchain.cmake"
CMAKE_TOOLCHAIN_FILE:class-native = "${WORKDIR}/toolchain-native.cmake"
export CMAKE_TOOLCHAIN_FILE

export LLVMLITE_SHARED = "ON"

BBCLASSEXTEND = "native"

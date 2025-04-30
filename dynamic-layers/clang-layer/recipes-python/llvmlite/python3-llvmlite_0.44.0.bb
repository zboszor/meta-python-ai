SUMMARY = "lightweight wrapper around basic LLVM functionality"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a15ea9843f27327e08f3c5fbf8043a2b"

DEPENDS = "clang15-native clang15"

PYPI_PACKAGE = "llvmlite"

PYPI_SEMVER_SUFFIX = ""
PYPI_ARCHIVE_NAME = "${PYPI_PACKAGE}-${PV}${PYPI_SEMVER_SUFFIX}.${PYPI_PACKAGE_EXT}"
PR = "${@ 'r1' if d.getVar('PYPI_SEMVER_SUFFIX') == '' else 'r0.'+d.getVar('PYPI_SEMVER_SUFFIX') }"

S:append = "${PYPI_SEMVER_SUFFIX}"

inherit pypi cmake setuptools3

SRC_URI[sha256sum] = "07667d66a5d150abed9157ab6c0b9393c9356f229784a4385c02f99e94fc94d4"

CXXFLAGS += "-I${STAGING_INCDIR}/${PYTHON_DIR}"

export CMAKE_ARGS = "-DCMAKE_TOOLCHAIN_FILE=${WORKDIR}/toolchain.cmake"

BBCLASSEXTEND = "native"

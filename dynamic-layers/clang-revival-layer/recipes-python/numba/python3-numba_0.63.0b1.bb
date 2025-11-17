SUMMARY = "compiling Python code using LLVM"
LICENSE = "BSD-2-Clause & BSD-3-Clause & MIT"
LIC_FILES_CHKSUM = " \
	file://LICENSE;md5=d9bed34136e8491d5d792c7efc17f10c \
	file://LICENSES.third-party;md5=4c703a4b0c75b96efc0303df04b235a7 \
"

DEPENDS = "clang15-native clang15 python3-numpy-native"

PYPI_PACKAGE = "numba"

inherit pypi cmake setuptools3

SRC_URI[sha256sum] = "66b7a0052e2cfe8befa273e5af3eae75e102ac9c3da7d2ca361b7b72cf5051c8"

export NUMBA_DISABLE_TBB = "1"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-llvmlite \
"

BBCLASSEXTEND = "native"

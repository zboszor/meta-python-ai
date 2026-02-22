SUMMARY = "compiling Python code using LLVM"
LICENSE = "BSD-2-Clause & BSD-3-Clause & MIT"
LIC_FILES_CHKSUM = " \
	file://LICENSE;md5=d9bed34136e8491d5d792c7efc17f10c \
	file://LICENSES.third-party;md5=b5c6e034c796a55e98027b6bd95e1a56 \
"

DEPENDS = "python3-numpy-native openmp"

PYPI_PACKAGE = "numba"

inherit pypi cmake setuptools3

SRC_URI[sha256sum] = "95e7300af648baa3308127b1955b52ce6d11889d16e8cfe637b4f85d2fca52b1"

export NUMBA_DISABLE_TBB = "1"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-llvmlite \
"

BBCLASSEXTEND = "native"

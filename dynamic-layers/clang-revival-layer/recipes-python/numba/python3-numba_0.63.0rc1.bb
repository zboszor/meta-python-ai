SUMMARY = "compiling Python code using LLVM"
LICENSE = "BSD-2-Clause & BSD-3-Clause & MIT"
LIC_FILES_CHKSUM = " \
	file://LICENSE;md5=d9bed34136e8491d5d792c7efc17f10c \
	file://LICENSES.third-party;md5=b5c6e034c796a55e98027b6bd95e1a56 \
"

DEPENDS = "python3-numpy-native"

PYPI_PACKAGE = "numba"

inherit pypi cmake setuptools3

SRC_URI[sha256sum] = "6a09200a740ca1020910f9883f56833c81487a6fc548898e1690aeef19133e3b"

export NUMBA_DISABLE_TBB = "1"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-llvmlite \
"

BBCLASSEXTEND = "native"

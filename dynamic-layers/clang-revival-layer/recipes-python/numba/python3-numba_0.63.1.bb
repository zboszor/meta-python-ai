SUMMARY = "compiling Python code using LLVM"
LICENSE = "BSD-2-Clause & BSD-3-Clause & MIT"
LIC_FILES_CHKSUM = " \
	file://LICENSE;md5=d9bed34136e8491d5d792c7efc17f10c \
	file://LICENSES.third-party;md5=b5c6e034c796a55e98027b6bd95e1a56 \
"

DEPENDS = "python3-numpy-native"

PYPI_PACKAGE = "numba"

inherit pypi cmake setuptools3

SRC_URI[sha256sum] = "b320aa675d0e3b17b40364935ea52a7b1c670c9037c39cf92c49502a75902f4b"

export NUMBA_DISABLE_TBB = "1"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-llvmlite \
"

BBCLASSEXTEND = "native"

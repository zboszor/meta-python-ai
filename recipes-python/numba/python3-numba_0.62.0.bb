SUMMARY = "compiling Python code using LLVM"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d9bed34136e8491d5d792c7efc17f10c"

DEPENDS = "python3-numpy-native tbb"

PYPI_PACKAGE = "numba"

PYPI_SEMVER_SUFFIX = "rc1"
PYPI_PACKAGE_EXT = "tar.gz"
PYPI_ARCHIVE_NAME = "${PYPI_PACKAGE}-${PV}${PYPI_SEMVER_SUFFIX}.${PYPI_PACKAGE_EXT}"
PR = "${@ 'r1' if d.getVar('PYPI_SEMVER_SUFFIX') == '' else 'r0.'+d.getVar('PYPI_SEMVER_SUFFIX') }"

SRC_URI = "https://files.pythonhosted.org/packages/source/n/${PYPI_PACKAGE}/${PYPI_ARCHIVE_NAME}"

S = "${UNPACKDIR}/${PYPI_PACKAGE}-${PV}${PYPI_SEMVER_SUFFIX}"

inherit cmake setuptools3 python3native

SRC_URI[sha256sum] = "f136e06c201c560cc18bfdf5f2459ed1ab5e66d14fb69f0ed35f811d1eae5b7b"

export NUMBA_DISABLE_TBB = "1"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-llvmlite \
"

BBCLASSEXTEND = "native"

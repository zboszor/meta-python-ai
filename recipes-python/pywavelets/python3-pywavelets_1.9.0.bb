SUMMARY = "PyWavelets, wavelet transform module"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3cb74dbf687acb614f22061875d6a1ad \
	file://licenses_bundled/LICENSE_numpy.txt;md5=1de863c37a83e71b1e97b64d036ea78b \
	file://licenses_bundled/LICENSE_scipy.txt;md5=5f477c3073ea2d02a70a764319f5f873"

DEPENDS = "python3-numpy-native"

PYPI_PACKAGE = "pywavelets"

inherit pypi pkgconfig python_mesonpy cython
SRC_URI[sha256sum] = "148d12203377772bea452a59211d98649c8ee4a05eff019a9021853a36babdc8"

SRC_URI += "file://build-fixes.patch"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-scipy \
"

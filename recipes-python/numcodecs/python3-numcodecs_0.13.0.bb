SUMMARY = "A Python package providing buffer compression and transformation codecs for use"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=810754f122e3afecd846c63e97ee2170"

DEPENDS = " \
	python3-setuptools-scm-native python3-cython-native \
	python3-numpy-native python3-py-cpuinfo-native \
"

PYPI_PACKAGE = "numcodecs"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "ba4fac7036ea5a078c7afe1d4dffeb9685080d42f19c9c16b12dad866703aa2e"

SRC_URI += "file://0001-fix-c-compiler-setup-562.patch"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-pcodec \
	python3-py-cpuinfo \
"

CFLAGS:append:x86-64:class-target = " -mavx -mavx2 "
BUILD_CFLAGS:append:x86-64:class-target = " -mavx -mavx2 "

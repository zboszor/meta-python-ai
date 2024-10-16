SUMMARY = "A Python package providing buffer compression and transformation codecs for use"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=810754f122e3afecd846c63e97ee2170"

DEPENDS = " \
	python3-setuptools-scm-native python3-cython-native \
	python3-numpy-native python3-py-cpuinfo-native \
"

PYPI_PACKAGE = "numcodecs"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "a3cf37881df0898f3a9c0d4477df88133fe85185bffe57ba31bcc2fa207709bc"

do_install:prepend () {
	sed -i 's:${RECIPE_SYSROOT_NATIVE}::g' ${S}/numcodecs/vlen.c
}

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-pcodec \
	python3-py-cpuinfo \
"

CFLAGS:append:x86-64:class-target = " -mavx -mavx2 "
BUILD_CFLAGS:append:x86-64:class-target = " -mavx -mavx2 "

SUMMARY = "A Python package providing buffer compression and transformation codecs for use"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=810754f122e3afecd846c63e97ee2170"

DEPENDS = " \
	python3-setuptools-scm-native python3-cython-native \
	python3-numpy-native python3-py-cpuinfo-native \
"

PYPI_PACKAGE = "numcodecs"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "9922dae0c3b01b5bed3b4bae239f4787e891daa3262c27971298669d029d10e9"

do_install:prepend () {
	sed -i 's:${RECIPE_SYSROOT_NATIVE}::g' ${S}/numcodecs/vlen.c
}

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-py-cpuinfo \
	python3-pcodec \
	python3-msgpack \
	python3-zfpy \
	python3-crc32c \
"

CFLAGS:append = " -std=gnu17"
CFLAGS:append:x86-64:class-target = " -mavx -mavx2 "
BUILD_CFLAGS:append:x86-64:class-target = " -mavx -mavx2 "

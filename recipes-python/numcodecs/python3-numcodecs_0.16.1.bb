SUMMARY = "A Python package providing buffer compression and transformation codecs for use"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=810754f122e3afecd846c63e97ee2170"

DEPENDS = " \
	python3-setuptools-scm-native python3-cython-native \
	python3-numpy-native python3-py-cpuinfo-native \
"

PYPI_PACKAGE = "numcodecs"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "c47f20d656454568c6b4697ce02081e6bbb512f198738c6a56fafe8029c97fb1"

SRC_URI += "file://0001-Revert-Update-license-metadata-and-include-third-par.patch"

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

CFLAGS:append:x86-64:class-target = " -mavx -mavx2 "
BUILD_CFLAGS:append:x86-64:class-target = " -mavx -mavx2 "

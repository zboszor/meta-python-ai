SUMMARY = "A Python package providing buffer compression and transformation codecs for use"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=810754f122e3afecd846c63e97ee2170"

DEPENDS =  "python3-setuptools-scm-native python3-cython-native python3-py-cpuinfo-native"

PYPI_PACKAGE = "numcodecs"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "05d91a433733e7eef268d7e80ec226a0232da244289614a8f3826901aec1098e"

RDEPENDS:${PN} = "python3-numpy"

CFLAGS:append:x86-64:class-target = " -mavx -mavx2 "
BUILD_CFLAGS:append:x86-64:class-target = " -mavx -mavx2 "

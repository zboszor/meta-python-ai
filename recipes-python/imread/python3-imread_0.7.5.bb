SUMMARY = "imread: Image reading library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING.MIT;md5=92a0f59e5018dd6b99cff090e56fe84a"

DEPENDS = "python3-numpy-native libjpeg-turbo libpng tiff"

PYPI_PACKAGE = "imread"

inherit pypi setuptools3
SRC_URI[sha256sum] = "1a25a9035dbc1ae2e56c15b50904071d555ea197eef58ca1d9117349db470db7"

SRC_URI += "file://disable-extra-system-dirs.patch"

RDEPENDS:${PN} = "python3-numpy"

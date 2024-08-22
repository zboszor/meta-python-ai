SUMMARY = "imread: Image reading library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING.MIT;md5=92a0f59e5018dd6b99cff090e56fe84a"

DEPENDS = "python3-numpy-native libjpeg-turbo libpng libwebp tiff"

PYPI_PACKAGE = "imread"

inherit pkgconfig pypi setuptools3
SRC_URI[sha256sum] = "50b3d7089c862504c22b256ef51fe45851b34616db14c0ebfc5536001c996015"

SRC_URI += "file://disable-extra-system-dirs.patch"

RDEPENDS:${PN} = "python3-numpy"

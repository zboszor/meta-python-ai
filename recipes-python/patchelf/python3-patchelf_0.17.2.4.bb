# This is a dummy package needed by python3-meson-python
SUMMARY = "A small utility to modify the dynamic linker and RPATH of ELF executables."
LICENSE = "GPL-3.0-or-later & Apache-2.0"
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
    file://COPYING;md5=d32239bcb673463ab874e80d47fae504 \
"

DEPENDS = "python3-scikit-build-core-native python3-ninja-native"

PYPI_PACKAGE = "patchelf"
PYPI_ARCHIVE_NAME_PREFIX = "pypi-"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "970ee5cd8af33e5ea2099510b2f9013fa1b8d5cd763bf3fd3961281c18101a09"

SRC_URI += " \
    file://CMakeLists.txt \
"

addtask do_patchbuild after do_patch before do_configure

do_patchbuild () {
    rm -f ${S}/CMakeLists.txt
    cp ${UNPACKDIR}/CMakeLists.txt ${S}/
}

RDEPENDS:${PN} = "patchelf"

BBCLASSEXTEND = "native nativesdk"

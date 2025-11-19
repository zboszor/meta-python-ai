SUMMARY = "High performance approximate and streaming algorithms"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0eaa5dc0edfd1b217f12d45ae54ec1b4"

DEPENDS = " \
	python3-cython-native python3-versioneer-native \
	python3-numpy-native python3-setuptools-scm-native \
	python3-numpy \
"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "973b8315fdd72bdeb5fdf4d6b2f444753fc0ebd6380f38f8e1138f8ff8797d99"
SRC_URI += "file://use-target-numpy.patch"

export NPY_INCLUDE = "${RECIPE_SYSROOT}${PYTHON_SITEPACKAGES_DIR}/numpy/_core/include"

do_install:append () {
	sed -i \
		-e 's:${RECIPE_SYSROOT_NATIVE}::g' \
		-e 's:${RECIPE_SYSROOT}::g' \
		${D}${PYTHON_SITEPACKAGES_DIR}/crick/space_saving.c \
		${D}${PYTHON_SITEPACKAGES_DIR}/crick/stats.c \
		${D}${PYTHON_SITEPACKAGES_DIR}/crick/tdigest.c \
		${S}/crick/space_saving.c \
		${S}/crick/stats.c \
		${S}/crick/tdigest.c
}

RDEPENDS:${PN} = " \
	python3-numpy \
"

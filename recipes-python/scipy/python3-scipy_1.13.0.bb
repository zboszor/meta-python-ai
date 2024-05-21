SUMMARY = "SciPy: Scientific Library for Python"
HOMEPAGE = "https://www.scipy.org"
LICENSE = "BSD-3-Clause & BSD-2-Clause & MIT & BSL-1.0 & Qhull & BSD-3-Clause-LBNL"
LIC_FILES_CHKSUM = " \
	file://LICENSE.txt;md5=5f477c3073ea2d02a70a764319f5f873 \
	file://LICENSES_bundled.txt;md5=260cda725e2b9e064ca9d61bb178808b \
"

inherit pkgconfig pypi python_mesonpy

SRC_URI[sha256sum] = "58569af537ea29d3f78e5abd18398459f195546bb3be23d16677fb26616cc11e"

SRC_URI += "file://use-unversioned-numpy.patch"

DEPENDS += " \
	${PYTHON_PN}-numpy-native \
	${PYTHON_PN}-pybind11-native \
	${PYTHON_PN}-pythran-native \
	${PYTHON_PN}-gast-native \
	${PYTHON_PN}-beniget-native \
	${PYTHON_PN}-ply-native \
	lapack \
"

DEPENDS:append:class-target = " \
	${PYTHON_PN}-numpy \
"

RDEPENDS:${PN} += " \
	${PYTHON_PN}-numpy \
"

PACKAGECONFIG ?= "openblas"

PACKAGECONFIG[openblas] = "-Dblas=openblas -Dlapack=openblas,,openblas,openblas"
PACKAGECONFIG[lapack] = "-Dblas=lapack -Dlapack=lapack,,lapack,lapack"
PACKAGECONFIG[f77] = "-Duse-g77-abi=true,,,"

CLEANBROKEN = "1"

export LAPACK = "${STAGING_LIBDIR}"
export BLAS = "${STAGING_LIBDIR}"

F90:class-native = "${FC}"
F90:class-target = "${TARGET_PREFIX}gfortran"
export F90

export F77 = "${TARGET_PREFIX}gfortran"

BBCLASSEXTEND = "native nativesdk"

do_configure:append:class-target() {
	if ! grep -q "numpy-include-dir" "${WORKDIR}/meson.cross" ; then
		sed -i "s,\[properties\],\[properties\]\nnumpy-include-dir = \'${RECIPE_SYSROOT}${PYTHON_SITEPACKAGES_DIR}/numpy/core/include/\' ,g" "${WORKDIR}/meson.cross"
	fi
}

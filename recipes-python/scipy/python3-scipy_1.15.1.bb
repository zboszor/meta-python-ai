SUMMARY = "SciPy: Scientific Library for Python"
HOMEPAGE = "https://www.scipy.org"
LICENSE = "BSD-3-Clause & BSD-2-Clause & MIT & BSL-1.0 & Qhull & BSD-3-Clause-LBNL & Apache-2.0-with-LLVM-exception"
LIC_FILES_CHKSUM = " \
	file://LICENSE.txt;md5=5f477c3073ea2d02a70a764319f5f873 \
	file://LICENSES_bundled.txt;md5=86efba5e36c406c7b024a0cff905a921 \
"

inherit pkgconfig pypi python3native python_mesonpy

SRC_URI[sha256sum] = "033a75ddad1463970c96a88063a1df87ccfddd526437136b6ee81ff0312ebdf6"

SRC_URI += " \
	file://0001-Assume-f2py-being-the-same-version-as-numpy.patch \
"

DEPENDS += " \
	python3-numpy-native \
	python3-pybind11-native \
	python3-pythran-native \
	python3-gast-native \
	python3-beniget-native \
	python3-ply-native \
	xsimd \
"

DEPENDS:append:class-target = " \
	python3-scipy-native \
	python3-numpy \
"

RDEPENDS:${PN} += " \
	python3-numpy \
"

PACKAGECONFIG ?= "openblas pythran"

PACKAGECONFIG[openblas] = "-Dblas=openblas -Dlapack=openblas,,openblas,openblas"
PACKAGECONFIG[lapack] = "-Dblas=lapack -Dlapack=lapack,,lapack,lapack"
PACKAGECONFIG[f77] = "-Duse-g77-abi=true,,,"
PACKAGECONFIG[pythran] = "-Duse-pythran=true,-Duse-pythran=false,python3-pythran-native python3-pythran,python3-pythran"

CLEANBROKEN = "1"

export LAPACK = "${STAGING_LIBDIR}"
export BLAS = "${STAGING_LIBDIR}"

F90:class-native = "${FC}"
F90:class-target = "${TARGET_PREFIX}gfortran"
export F90

export F77 = "${TARGET_PREFIX}gfortran"

PKG_CONFIG_PATH:append = ":${RECIPE_SYSROOT}${PYTHON_SITEPACKAGES_DIR}/numpy/_core/lib/pkgconfig"

do_install:append:class-target () {
	sed -i \
		-e 's|, --sysroot=[^"]*||g' \
		-e 's|, -ffile-prefix-map=[^,]*||g' \
		-e 's|, -fdebug-prefix-map=[^,]*||g' \
		-e 's|, -fmacro-prefix-map=[^,]*||g' \
		-e 's|nativepython3|python3|g' \
		-e 's|r"${STAGING_DIR_NATIVE}|r"|g' \
		-e 's|r"${STAGING_DIR_TARGET}|r"|g' \
		-e 's|r"../../recipe-sysroot-native|r"|g' \
		${D}${PYTHON_SITEPACKAGES_DIR}/scipy/__config__.py

	rm -f ${D}${PYTHON_SITEPACKAGES_DIR}/scipy/__pycache__/__config__.*.pyc
}

FILES:${PN}-staticdev += "${PYTHON_SITEPACKAGES_DIR}/scipy/optimize/_highspy/libhighs.a"

BBCLASSEXTEND = "native nativesdk"

SUMMARY = "SciPy: Scientific Library for Python"
HOMEPAGE = "https://www.scipy.org"
LICENSE = "BSD-3-Clause & BSD-2-Clause & MIT & BSL-1.0 & Qhull & BSD-3-Clause-LBNL & Apache-2.0-with-LLVM-exception"
LIC_FILES_CHKSUM = " \
	file://LICENSE.txt;md5=6506a2e1578b1a1161d9bda0b896c647 \
	file://LICENSES_bundled.txt;md5=7bb7625ea6d801cd9de63572db6f0aa2 \
"

inherit pkgconfig pypi python3native python_mesonpy cython

SRC_URI[sha256sum] = "95d8e012d8cb8816c226aef832200b1d45109ed4464303e997c5b13122b297c0"

SRC_URI += "file://0001-Assume-f2py-being-the-same-version-as-numpy.patch"

DEPENDS += " \
	python3-numpy-native \
	python3-pybind11-native \
	python3-pythran-native \
	python3-gast-native \
	python3-beniget-native \
	python3-ply-native \
	python3-pybind11 \
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

do_configure:append:class-target() {
	if ! grep -q "numpy-include-dir" "${WORKDIR}/meson.cross" ; then
		sed -i "s,\[properties\],\[properties\]\nnumpy-include-dir = \'${RECIPE_SYSROOT}${PYTHON_SITEPACKAGES_DIR}/numpy/_core/include/\' ,g" "${WORKDIR}/meson.cross"
	fi
}

do_install:append:class-target () {
	sed -i \
		-e 's|, --sysroot=[^,"]*||g' \
		-e 's|, -ffile-prefix-map=[^,"]*||g' \
		-e 's|, -fdebug-prefix-map=[^,"]*||g' \
		-e 's|, -fmacro-prefix-map=[^,"]*||g' \
		-e 's|nativepython3|python3|g' \
		-e 's|r"${STAGING_DIR_NATIVE}|r"|g' \
		-e 's|r"${STAGING_DIR_TARGET}|r"|g' \
		-e 's|r"../../recipe-sysroot-native|r"|g' \
		${D}${PYTHON_SITEPACKAGES_DIR}/scipy/__config__.py

	rm -f ${D}${PYTHON_SITEPACKAGES_DIR}/scipy/__pycache__/__config__.*.pyc
}

FILES:${PN}-staticdev += "${PYTHON_SITEPACKAGES_DIR}/scipy/optimize/_highspy/libhighs.a"

BBCLASSEXTEND = "native nativesdk"

inherit pypi setuptools3

SUMMARY = "SciPy: Scientific Library for Python"
HOMEPAGE = "https://www.scipy.org"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=27ca2e35416b6316570bf126e08b7062"

SRC_URI += " \
	file://0001-Allow-passing-flags-via-FARCH-for-mach.patch \
	file://static-lib.patch \
	file://0001-When-forward-declaring-print_soln-give-it-the-correc.patch \
	file://0001-SuperLU-Don-t-redefine-fopen.patch \
	file://0001-SuperLU-Don-t-redeclare-zcheck_tempv.patch \
"
SRC_URI[md5sum] = "df5ce79288fc457238aeef18e8f70dfc"
SRC_URI[sha256sum] = "9e3fb1b0e896f14a85aa9a28d5f755daaeeb54c897b746df7a55ccb02b340f33"

DEPENDS += " \
	python3-numpy \
	python3-numpy-native \
	python3-pybind11-native \
	python3-pythran-native \
	python3-gast-native \
	python3-beniget-native \
	python3-ply-native \
	lapack \
"

RDEPENDS:${PN} += " \
	python3-numpy \
	lapack \
"

CLEANBROKEN = "1"

export LAPACK = "${STAGING_LIBDIR}"
export BLAS = "${STAGING_LIBDIR}"

export F90 = "${TARGET_PREFIX}gfortran"
export F77 = "${TARGET_PREFIX}gfortran"
export FARCH = "${TUNE_CCARGS}"

export NUMPY_INCLUDE_PATH = "${STAGING_DIR_TARGET}/usr/lib/python${PYTHON_BASEVERSION}/site-packages/numpy/core/include"

# Numpy expects the LDSHARED env variable to point to a single
# executable, but OE sets it to include some flags as well. So we split
# the existing LDSHARED variable into the base executable and flags, and
# prepend the flags into LDFLAGS
LDFLAGS:prepend := "${@" ".join(d.getVar('LDSHARED', True).split()[1:])} "
export LDSHARED := "${@d.getVar('LDSHARED', True).split()[0]}"

# Tell Numpy to look in target sysroot site-packages directory for libraries
LDFLAGS:append = " -L${STAGING_LIBDIR}/${PYTHON_DIR}/site-packages/numpy/core/lib"

INSANE_SKIP:${PN} = "already-stripped"

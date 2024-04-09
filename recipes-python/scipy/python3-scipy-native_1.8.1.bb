SUMMARY = "SciPy: Scientific Library for Python"
HOMEPAGE = "https://www.scipy.org"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=27ca2e35416b6316570bf126e08b7062"

SRC_URI = "https://pypi.python.org/packages/source/s/scipy/scipy-${PV}.tar.gz \
           file://0001-Allow-passing-flags-via-FARCH-for-mach.patch \
           "

SRC_URI[md5sum] = "df5ce79288fc457238aeef18e8f70dfc"
SRC_URI[sha256sum] = "9e3fb1b0e896f14a85aa9a28d5f755daaeeb54c897b746df7a55ccb02b340f33"

S = "${WORKDIR}/scipy-${PV}"

DEPENDS += " \
	${PYTHON_PN}-numpy-native \
	${PYTHON_PN}-pybind11-native \
	${PYTHON_PN}-pythran-native \
	${PYTHON_PN}-gast-native \
	${PYTHON_PN}-beniget-native \
	${PYTHON_PN}-ply-native \
	lapack-native \
"

CLEANBROKEN = "1"

inherit setuptools3 native

export LAPACK = "${STAGING_LIBDIR}"
export BLAS = "${STAGING_LIBDIR}"

export F90 = "${FC}"

# Numpy expects the LDSHARED env variable to point to a single
# executable, but OE sets it to include some flags as well. So we split
# the existing LDSHARED variable into the base executable and flags, and
# prepend the flags into LDFLAGS
LDFLAGS:prepend := "${@" ".join(d.getVar('LDSHARED', True).split()[1:])} "
export LDSHARED := "${@d.getVar('LDSHARED', True).split()[0]}"

# Tell Numpy to look in target sysroot site-packages directory for libraries
LDFLAGS:append = " -L${STAGING_LIBDIR}/${PYTHON_DIR}/site-packages/numpy/core/lib"

INSANE_SKIP:${PN} = "already-stripped"

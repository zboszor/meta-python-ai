SUMMARY = "A set of python modules for machine learning and data mining"
HOMEPAGE = "http://scikit-learn.org"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=c0c49304a5cb997fd012292beee4ddce"

PYPI_PACKAGE = "scikit_learn"
SRC_URI[sha256sum] = "0ea5d40c0e3951df445721927448755d3fe1d80833b0b7308ebff5d2a45e6414"

inherit pypi setuptools3 pkgconfig python3-dir

export PYTHON_CROSSENV = "1"
export SKLEARN_BUILD_PARALLEL = "${@oe.utils.cpu_count()}"
export NPY_PKG_CONFIG_PATH = "${WORKDIR}/npy-pkg-config"
export NUMPY_INCLUDE_PATH = "${STAGING_DIR_TARGET}${libdir}/python${PYTHON_BASEVERSION}/site-packages/numpy/core/include"

# Tell Numpy to look in target sysroot site-packages directory for libraries
LDFLAGS:append = " -L${STAGING_LIBDIR}/${PYTHON_DIR}/site-packages/numpy/core/lib"

do_compile:prepend() {
	echo "[ALL]" > ${S}/site.cfg
	echo "library_dirs = ${STAGING_LIBDIR}" >> ${S}/site.cfg
	echo "include_dirs = ${STAGING_INCDIR}" >> ${S}/site.cfg

	mkdir -p ${WORKDIR}/npy-pkg-config
	cp ${STAGING_DIR_TARGET}${libdir}/python${PYTHON_BASEVERSION}/site-packages/numpy/core/lib/npy-pkg-config/* ${WORKDIR}/npy-pkg-config
	sed -i 's&prefix=${pkgdir}&prefix=${STAGING_DIR_TARGET}${libdir}/python${PYTHON_BASEVERSION}/site-packages/numpy/core&g' ${WORKDIR}/npy-pkg-config/npymath.ini
	sed -i 's&prefix=${pkgdir}&prefix=${STAGING_DIR_TARGET}${libdir}/python${PYTHON_BASEVERSION}/site-packages/numpy/core&g' ${WORKDIR}/npy-pkg-config/mlib.ini
}

DEPENDS += " \
	python3-cython-native \
	python3-numpy-native \
	python3-pythran-native \
	python3-scipy-native \
	python3-numpy \
	python3-scipy \
	python3-cython \
"

RDEPENDS:${PN} += " \
	python3-numpy \
	python3-scipy \
	python3-joblib \
	python3-threadpoolctl \
	python3-pytest \
"

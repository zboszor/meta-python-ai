SUMMARY = "Time-handling functionality from netcdf4-python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1de0730ff219a4ad98240cf4fd07e9cb"

DEPENDS = "python3-setuptools-scm-native python3-numpy-native python3-numpy"

PYPI_PACKAGE = "cftime"

inherit pypi python_setuptools_build_meta cython
SRC_URI[sha256sum] = "8225fed6b9b43fb87683ebab52130450fc1730011150d3092096a90e54d1e81e"

do_install:append() {
	sed -i \
		-e 's:${STAGING_DIR_NATIVE}::g' \
		-e 's:../../recipe-sysroot-native::g' \
		${D}${PYTHON_SITEPACKAGES_DIR}/cftime/_cftime.c
}

RDEPENDS:${PN} = "python3-numpy"

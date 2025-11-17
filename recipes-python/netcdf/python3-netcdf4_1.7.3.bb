SUMMARY = "Provides an object-oriented python interface to the netCDF version 4 library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1de0730ff219a4ad98240cf4fd07e9cb"

DEPENDS = " \
	python3-setuptools-scm-native python3-numpy-native python3-numpy \
	netcdf-c hdf5 libjpeg-turbo curl \
"

PYPI_PACKAGE = "netcdf4"

inherit pypi python_setuptools_build_meta pkgconfig cython
SRC_URI[sha256sum] = "83f122fc3415e92b1d4904fd6a0898468b5404c09432c34beb6b16c533884673"

SRC_URI += "file://fix-tmpdir-refs.patch"

export HDF5_DIR = "${STAGING_EXECPREFIXDIR}"
export NETCDF4_DIR = "${STAGING_EXECPREFIXDIR}"
export JPEG_DIR = "${STAGING_EXECPREFIXDIR}"
export CURL_DIR = "${STAGING_EXECPREFIXDIR}"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-cftime \
	python3-certifi \
"

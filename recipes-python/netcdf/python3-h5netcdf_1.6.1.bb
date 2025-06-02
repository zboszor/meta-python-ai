SUMMARY = "netCDF4 via h5py"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=76c63b1d51f395183a68cc5da679bc95"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "h5netcdf"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "7ef4ecd811374d94d29ac5e7f7db71ff59b55ef8eeefbe4ccc2c316853d31894"

RDEPENDS:${PN} = "python3-h5py"

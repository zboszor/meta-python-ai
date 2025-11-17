SUMMARY = "netCDF4 via h5py"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=76c63b1d51f395183a68cc5da679bc95"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "h5netcdf"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "f62a0e77d1e2a6cd8b9d8120d5b62b6a015dc7c6185768a01e983c77c0b794e3"

RDEPENDS:${PN} = "python3-h5py"

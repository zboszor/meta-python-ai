SUMMARY = "netCDF4 via h5py"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=76c63b1d51f395183a68cc5da679bc95"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "h5netcdf"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "9b396a4cc346050fc1a4df8523bc1853681ec3544e0449027ae397cb953c7a16"

RDEPENDS:${PN} = "python3-h5py"

SUMMARY = "Time-handling functionality from netcdf4-python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1de0730ff219a4ad98240cf4fd07e9cb"

DEPENDS = "python3-setuptools-scm-native python3-numpy-native python3-numpy"

PYPI_PACKAGE = "cftime"

inherit pypi python_setuptools_build_meta cython
SRC_URI[sha256sum] = "50ac76cc9f10ab7bd46e44a71c51a6927051b499b4407df4f29ab13d741b942f"

RDEPENDS:${PN} = "python3-numpy"

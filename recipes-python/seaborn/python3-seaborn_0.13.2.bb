SUMMARY = "Statistical data visualization"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=bff71107d52061931e88f61561c06dd4"

PYPI_PACKAGE = "seaborn"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "93e60a40988f4d65e9f4885df477e2fdaff6b73a9ded434c1ab356dd57eefff7"

RDEPENDS:${PN} = "python3-numpy python3-matplotlib python3-pandas python3-scipy"

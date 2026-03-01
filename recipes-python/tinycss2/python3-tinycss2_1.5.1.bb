SUMMARY = "A tiny CSS parser"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1d072d7e30e34f33f8ae956ada04fa2c"

PYPI_PACKAGE = "tinycss2"

inherit pypi python_flit_core
SRC_URI[sha256sum] = "d339d2b616ba90ccce58da8495a78f46e55d4d25f9fd71dfd526f07e7d53f957"

RDEPENDS:${PN} = "python3-webencodings"

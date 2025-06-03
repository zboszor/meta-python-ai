SUMMARY = "Python helpers to limit the number of threads used in native libraries that handle their own internal threadpool (BLAS and OpenMP implementations)"
HOMEPAGE = "https://github.com/joblib/threadpoolctl"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f2439cfddfbeebdb5cac3ae4ae80eaf"

PYPI_PACKAGE = "threadpoolctl"

SRC_URI[sha256sum] = "8ab8b4aa3491d812b623328249fab5302a68d2d71745c8a4c719a2fcaba9f44e"

inherit pypi python_flit_core

SUMMARY = "Python helpers to limit the number of threads used in native libraries that handle their own internal threadpool (BLAS and OpenMP implementations)"
HOMEPAGE = "https://github.com/joblib/threadpoolctl"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f2439cfddfbeebdb5cac3ae4ae80eaf"

PYPI_PACKAGE = "threadpoolctl"

SRC_URI[sha256sum] = "f11b491a03661d6dd7ef692dd422ab34185d982466c49c8f98c8f716b5c93196"

inherit pypi python_flit_core

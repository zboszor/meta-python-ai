SUMMARY = "Python helpers to limit the number of threads used in native libraries that handle their own internal threadpool (BLAS and OpenMP implementations)"
HOMEPAGE = "https://github.com/joblib/threadpoolctl"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f2439cfddfbeebdb5cac3ae4ae80eaf"

PYPI_PACKAGE = "threadpoolctl"

SRC_URI[sha256sum] = "082433502dd922bf738de0d8bcc4fdcbf0979ff44c42bd40f5af8a282f6fa107"

inherit pypi python_flit_core

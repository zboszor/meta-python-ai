SUMMARY = "A python wrapper of the C library 'Google CRC32C'"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS = "google-crc32c"

PYPI_PACKAGE = "google_crc32c"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "7b8c84c3d159ab6817fe3f74e6e6cef099c3f95dcec3abc0d8afb1404642efbe"

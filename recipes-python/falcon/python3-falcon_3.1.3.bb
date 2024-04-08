SUMMARY = "The Falcon Web Framework"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

PYPI_PACKAGE = "falcon"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "23335dbccd44f29e85ec55f2f35d5a0bc12bd7a509f641ab81f5c64b65626263"

DEPENDS += "python3-cython-native"

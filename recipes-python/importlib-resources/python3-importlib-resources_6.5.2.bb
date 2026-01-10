SUMMARY = "Read resources from Python packages"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "importlib_resources"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "185f87adef5bcc288449d98fb4fba07cea78bc036455dd44c5fc4a2fe78fed2c"

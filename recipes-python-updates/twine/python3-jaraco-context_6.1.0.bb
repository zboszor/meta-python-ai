SUMMARY = "Useful decorators and context managers"
DESCRIPTION = "Useful decorators and context managers"
HOMEPAGE = "https://github.com/jaraco/jaraco.context"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2e21c3f75eb8d9427c8a611a8e83e9d6"

DEPENDS = "python3-setuptools-scm-native python3-coherent-licensed-native"

PYPI_PACKAGE = "jaraco_context"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "129a341b0a85a7db7879e22acd66902fda67882db771754574338898b2d5d86f"

BBCLASSEXTEND = "native nativesdk"

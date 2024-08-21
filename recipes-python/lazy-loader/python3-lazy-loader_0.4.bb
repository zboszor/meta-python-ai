SUMMARY = "lazy_loader"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=0ed504abd9c0cbada2733980c9c7501f"

DEPENDS = "python3-flit-core-native"

PYPI_PACKAGE = "lazy_loader"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "47c75182589b91a4e1a85a136c074285a5ad4d9f39c63e0d7fb76391c4574cd1"

BBCLASSEXTEND = "native nativesdk"

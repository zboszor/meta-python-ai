SUMMARY = "High Level Expressions for Dask"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=89af100a7bae9d8fb0254e882ebd96e3"

DEPENDS = "python3-versioneer-native"

PYPI_PACKAGE = "dask_expr"

inherit pypi python_setuptools_build_meta cython

SRC_URI[sha256sum] = "e6d5a7bdff927aa4a1754a76cad79c5925254c525f568038df7832fcd558fc11"

RDEPENDS:${PN} = " \
	python3-dask \
"

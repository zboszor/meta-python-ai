SUMMARY = "High Level Expressions for Dask"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=89af100a7bae9d8fb0254e882ebd96e3"

DEPENDS = "python3-cython-native python3-versioneer-native"

inherit python_setuptools_build_meta

SRC_URI = " \
	git://github.com/dask/dask-expr.git;protocol=https;branch=main \
	file://0001-Use-versioneer-toml-0.28.patch \
"
SRCREV = "ca5db2215c94d011ea0f2a086195a96734477d3f"

S = "${UNPACKDIR}/git"

RDEPENDS:${PN} = " \
	python3-dask \
	python3-pyarrow \
	python3-pandas \
	python3-crick \
	python3-distributed \
"

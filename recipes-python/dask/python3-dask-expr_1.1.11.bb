SUMMARY = "High Level Expressions for Dask"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=89af100a7bae9d8fb0254e882ebd96e3"

DEPENDS = "python3-cython-native python3-versioneer-native"

inherit python_setuptools_build_meta

SRC_URI = "git://github.com/dask/dask-expr.git;protocol=https;branch=main"
SRCREV = "b0c980e51525ce49fb29c89711ce4536970e377b"

S = "${UNPACKDIR}/git"

RDEPENDS:${PN} = " \
	python3-dask \
	python3-pyarrow \
	python3-pandas \
	python3-crick \
	python3-distributed \
"

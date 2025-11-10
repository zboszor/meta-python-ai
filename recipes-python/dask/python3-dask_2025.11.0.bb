SUMMARY = "Parallel PyData with Task Scheduling"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f5eb2002f2deb4e003875dd453131e73"

DEPENDS = "python3-cython-native python3-versioneer-native python3-setuptools-scm-native"

PYPI_PACKAGE = "dask"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "23d59e624b80ee05b7cc8df858682cca58262c4c3b197ccf61da0f6543c8f7c3"

# dask and distributed must be the same version
RDEPENDS:${PN} = " \
	python3-click \
	python3-cloudpickle \
	python3-fsspec \
	python3-partd \
	python3-pyyaml \
	python3-toolz \
"

RRECOMMENDS:${PN} = " \
	python3-numpy \
	python3-pandas \
	python3-pyarrow \
	python3-distributed \
	python3-bokeh \
	python3-jinja2 \
	python3-lz4 \
	python3-dask-expr \
"

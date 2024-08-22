SUMMARY = "Parallel PyData with Task Scheduling"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f5eb2002f2deb4e003875dd453131e73"

DEPENDS = "python3-cython-native python3-versioneer-native"

PYPI_PACKAGE = "dask"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "4254e43ac8c3affad2b22952f126b00a00f52c87caae91c068d8e395a4ad1a72"

# dask and distributed must be the same version
RDEPENDS:${PN} = " \
	python3-numpy \
	python3-pandas \
	python3-distributed \
	python3-bokeh \
	python3-jinja2 \
	python3-click \
	python3-cloudpickle \
	python3-fsspec \
	python3-partd \
	python3-pyyaml \
	python3-toolz \
	python3-importlib-metadata \
"

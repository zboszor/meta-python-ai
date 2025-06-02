SUMMARY = "Distributed scheduler for Dask"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=4bcc9811041b932eff9964fc8693aa4d"

DEPENDS = "python3-versioneer-native"

PYPI_PACKAGE = "distributed"

inherit pypi python_setuptools_build_meta cython
SRC_URI[sha256sum] = "cf1d62a2c17a0a9fc1544bd10bb7afd39f22f24aaa9e3df3209c44d2cfb16703"

# dask and distributed must be the same version
RDEPENDS:${PN} = " \
	python3-click \
	python3-cloudpickle \
	python3-dask \
	python3-jinja2 \
	python3-locket \
	python3-msgpack \
	python3-psutil \
	python3-pyyaml \
	python3-sortedcontainers \
	python3-tblib \
	python3-toolz \
	python3-tornado \
	python3-urllib3 \
	python3-zict \
"

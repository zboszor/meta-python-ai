SUMMARY = "A friend to fetch your data files"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=34edf66cdaea1acc8b8a430af829c7dc"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "pooch"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "de46729579b9857ffd3e741987a2f6d5e0e03219892c167c6578c0091fb511ed"

RDEPENDS:${PN} = " \
	python3-platformdirs \
	python3-requests \
	python3-tqdm \
	python3-paramiko \
	python3-xxhash \
"

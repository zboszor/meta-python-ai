SUMMARY = "A friend to fetch your data files"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=34edf66cdaea1acc8b8a430af829c7dc"

DEPENDS = "python3-setuptools-scm-native"

PYPI_PACKAGE = "pooch"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "76561f0de68a01da4df6af38e9955c4c9d1a5c90da73f7e40276a5728ec83d10"

RDEPENDS:${PN} = " \
	python3-platformdirs \
	python3-requests \
	python3-tqdm \
	python3-paramiko \
	python3-xxhash \
"

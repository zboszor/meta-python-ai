SUMMARY = "A fast & compressed ndarray library with a flexible compute engine"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=9e83d0f0a0aa9e54a974192bde854dec"

DEPENDS = " \
	python3-scikit-build-core-native \
	python3-numpy-native python3-numpy \
	ninja-native cmake-native unzip-native \
	blosc2 \
"

PYPI_PACKAGE = "blosc2"

inherit pypi pkgconfig cmake python_pep517 python3native python3-dir cython
SRC_URI[sha256sum] = "ebc8c80852361e1ea4ea5048c8ff09d0b7b5ea3797e29c72caec59d990a4d3f2"

SRC_URI += "file://fix-tmpdir-ref.patch"

export SKBUILD_CMAKE_BUILD_TYPE = "RelWithDebInfo"
export SKBUILD_CMAKE_VERBOSE = "ON"

export CMAKE_ARGS = " \
	-DCMAKE_TOOLCHAIN_FILE=${WORKDIR}/toolchain.cmake \
	-DSTAGING_DIR_NATIVE=${STAGING_DIR_NATIVE} \
"

export USE_SYSTEM_BLOSC2 = "1"

do_install () {
	# For some reason, the normal do_install() installs into
	# ${D}${STAGING_DIR_NATIVE}${PYTHON_SITEPACKAGES_DIR}
	# instead of ${D}${PYTHON_SITEPACKAGES_DIR}
	python_pep517_do_bootstrap_install
}

FILES:${PN} += "${PYTHON_SITEPACKAGES_DIR}"

INSANE_SKIP:${PN} = "already-stripped"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-ndindex \
	python3-msgpack \
	python3-platformdirs \
	python3-numexpr \
	python3-py-cpuinfo \
	python3-requests \
"

SUMMARY = "A fast & compressed ndarray library with a flexible compute engine"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=9e83d0f0a0aa9e54a974192bde854dec"

DEPENDS = " \
	python3-scikit-build-core-native python3-cmake-native \
	python3-numpy-native python3-numpy \
	ninja-native cmake-native unzip-native \
	blosc2 \
"

PYPI_PACKAGE = "blosc2"

inherit pypi pkgconfig cmake python_pep517 python3native python3-dir cython
SRC_URI[sha256sum] = "ff3bd06f77713e03e1fa2ec30cff872f8f1aba889ea69d96260584a962b660b2"

# This is the version of miniexpr used by blosc2 4.14.0
SRCREV_miniexpr = "f0b8c94771cd21d3c9029d6ccec204ab3a67584f"

# These are the versions of sleef and tinycc used by
# the version of miniexpr of the above commit.
SRCREV_sleef = "7623d6cfa2712462880fa63a4d0f0b5f775d1a83"
SRCREV_tinycc = "695ad1e6b5c9a00875192ca1f3a9c4949dee4858"

SRCREV_FORMAT = "miniexpr"

SRC_URI += " \
	git://github.com/Blosc/miniexpr.git;protocol=https;name=miniexpr;nobranch=1;destsuffix=miniexpr-src \
	git://github.com/shibatch/sleef.git;protocol=https;name=sleef;nobranch=1;destsuffix=sleef-src \
	git://github.com/Blosc/minicc.git;protocol=https;name=tinycc;nobranch=1;destsuffix=tinycc-src \
	file://fix-tmpdir-ref.patch \
	file://no-rpath.patch \
	file://miniexpr-fix-libtcc-default-path.patch;patchdir=${UNPACKDIR}/miniexpr-src \
"

export SKBUILD_CMAKE_BUILD_TYPE = "RelWithDebInfo"
export SKBUILD_CMAKE_VERBOSE = "ON"

CFLAGS += "-fmacro-prefix-map=${UNPACKDIR}=/usr/src -fdebug-prefix-map=${UNPACKDIR}=/usr/src"
CXXFLAGS += "-fmacro-prefix-map=${UNPACKDIR}=/usr/src -fdebug-prefix-map=${UNPACKDIR}=/usr/src"

export CMAKE_ARGS = " \
	-DCMAKE_TOOLCHAIN_FILE=${WORKDIR}/toolchain.cmake \
	-DSTAGING_DIR_NATIVE=${STAGING_DIR_NATIVE} \
	-DFETCHCONTENT_BASE_DIR=${UNPACKDIR} \
	-DFETCHCONTENT_SOURCE_DIR_MINIEXPR=${UNPACKDIR}/miniexpr-src \
	-DFETCHCONTENT_SOURCE_DIR_SLEEF=${UNPACKDIR}/sleef-src \
	-DFETCHCONTENT_SOURCE_DIR_TINYCC=${UNPACKDIR}/tinycc-src \
	-DMINIEXPR_TINYCC_SHARED_PATH='${PYTHON_SITEPACKAGES_DIR}/${PYPI_PACKAGE}/lib/libtcc.so' \
"

export USE_SYSTEM_BLOSC2 = "1"

do_compile:prepend () {
	sed -i \
		-e 's:@MINICC_CONFIG_USR_INCLUDE@:${includedir}:' \
		-e 's:@MINICC_CONFIG_SYSROOT@:/:' \
		${UNPACKDIR}/tinycc-src/cmake/config.h.in
}

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
	python3-numexpr \
	python3-pydantic \
	python3-httpx \
	python3-rich \
	python3-threadpoolctl \
	python3-pyarrow \
	python3-zarr \
	python3-h5py \
	python3-hdf5plugin \
	python3-fsspec \
"

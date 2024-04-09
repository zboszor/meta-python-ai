SUMMARY = "Python library for Apache Arrow"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=12;endline=27;md5=0fd3ec94b8d79a4efc4a86b35d73f50b"

DEPENDS = " \
	cmake-native python3-numpy-native python3-cython-native \
	python3-pip-native python3-setuptools-scm-native \
	apache-arrow zlib lz4 zstd \
"

PYPI_PACKAGE = "pyarrow"

inherit cmake pypi setuptools3_legacy

SRC_URI[sha256sum] = "9c9bc803cb3b7bfacc1e96ffbfd923601065d9d3f911179d81e72d99fd74a3d9"

SRC_URI += "file://toml-fix.patch"

export PYARROW_BUILD_TYPE = "Release"

export PYARROW_CMAKE_OPTIONS = "-DCMAKE_TOOLCHAIN_FILE='${WORKDIR}/toolchain.cmake'"

export PYARROW_CXXFLAGS = "${CXXFLAGS}"

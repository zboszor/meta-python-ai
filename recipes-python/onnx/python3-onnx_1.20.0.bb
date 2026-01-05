SUMMARY = "Open Neural Network Exchange"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS = " \
	python3-setuptools-native python3-setuptools-scm-native \
	python3-scikit-build-native python3-scikit-build-core-native \
	python3-numpy-native python3-protobuf-native \
	python3-pytest-runner-native python3-cmake-native \
	python3-pybind11-native python3-nanobind-native \
	python3-pybind11 python3-nanobind python3-protobuf robin-map \
"

PYPI_PACKAGE = "onnx"

inherit pypi pkgconfig cmake python_setuptools_build_meta python3native

SRC_URI[sha256sum] = "1a93ec69996b4556062d552ed1aa0671978cfd3c17a40bf4c89a1ae169c6a4ad"

SRC_URI += " \
	file://0001-Use-find_package-Python-for-nanobind.patch \
	file://0002-Disable-limited-api.patch \
"

CXXFLAGS += "-I${STAGING_INCDIR}/${PYTHON_DIR}"

export CMAKE_ARGS = "-DCMAKE_TOOLCHAIN_FILE=${WORKDIR}/toolchain.cmake \
	-DCMAKE_MAKE_PROGRAM=${STAGING_BINDIR_NATIVE}/ninja \
	-DONNX_BUILD_PYTHON=ON \
	-DONNX_USE_PROTOBUF_SHARED_LIBS=ON \
	-DPython_HOST_EXECUTABLE=${STAGING_BINDIR_NATIVE}/python3-native/python3 \
	-DPython_EXECUTABLE=${STAGING_BINDIR_NATIVE}/python3-native/python3 \
	-DPython3_EXECUTABLE=${STAGING_BINDIR_NATIVE}/python3-native/python3 \
	-Dnanobind_DIR=${RECIPE_SYSROOT}${PYTHON_SITEPACKAGES_DIR}/nanobind/cmake \
	-DProtobuf_DIR=${STAGING_EXECPREFIXDIR} \
	-DProtobuf_PROTOC_EXECUTABLE=${STAGING_BINDIR_NATIVE}/protoc \
	-DONNX_PROTOC_EXECUTABLE=${STAGING_BINDIR_NATIVE}/protoc \
	-DONNX_CUSTOM_PROTOC_EXECUTABLE=${STAGING_BINDIR_NATIVE}/protoc \
"

OECMAKE_C_COMPILER:prepend = "${STAGING_BINDIR_TOOLCHAIN}/"
OECMAKE_CXX_COMPILER:prepend = "${STAGING_BINDIR_TOOLCHAIN}/"

do_compile:prepend () {
	sed -i 's: ${STAGING_DIR_NATIVE} : :' ${WORKDIR}/toolchain.cmake
}

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-pybind11 \
	python3-nanobind \
"

INSANE_SKIP:${PN} = "already-stripped"

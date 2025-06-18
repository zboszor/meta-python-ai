SUMMARY = "Open Neural Network Exchange"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS = " \
	python3-numpy-native python3-protobuf-native \
	python3-pytest-runner-native python3-cmake-native \
	python3-pybind11-native python3-pybind11 protobuf \
"

PYPI_PACKAGE = "onnx"

inherit pypi cmake pkgconfig python3native python_setuptools_build_meta

SRC_URI[sha256sum] = "3d8dbf9e996629131ba3aa1afd1d8239b660d1f830c6688dd7e03157cccd6b9c"

SRC_URI += " \
	file://0001-Fix-referencing-Protobuf-from-the-host.patch \
	file://0001-Fix-cross-compiling.patch \
"

CXXFLAGS += "-I${STAGING_INCDIR}/${PYTHON_DIR}"

export CMAKE_ARGS = "-DCMAKE_TOOLCHAIN_FILE=${WORKDIR}/toolchain.cmake \
	-DONNX_BUILD_PYTHON=ON \
	-DPython_EXECUTABLE=${STAGING_BINDIR_NATIVE}/python3-native/python3 \
	-DONNX_USE_PROTOBUF_SHARED_LIBS=ON \
	-DProtobuf_INCLUDE_DIR=${STAGING_INCDIR} \
	-DProtobuf_LIBRARIES=${STAGING_LIBDIR} \
"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-pybind11 \
"

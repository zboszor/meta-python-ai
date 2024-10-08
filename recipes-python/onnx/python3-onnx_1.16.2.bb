SUMMARY = "Open Neural Network Exchange"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS = " \
	python3-numpy-native python3-protobuf-native \
	python3-pytest-runner-native python3-cmake-native \
	python3-pybind11-native python3-pybind11 protobuf \
"

PYPI_PACKAGE = "onnx"

inherit pypi cmake python3native python_setuptools_build_meta

SRC_URI[sha256sum] = "b33a282b038813c4b69e73ea65c2909768e8dd6cc10619b70632335daf094646"

CXXFLAGS += "-I${STAGING_INCDIR}/${PYTHON_DIR}"

export CMAKE_ARGS = "-DCMAKE_TOOLCHAIN_FILE=${WORKDIR}/toolchain.cmake \
	-DONNX_USE_PROTOBUF_SHARED_LIBS=ON \
	-DProtobuf_INCLUDE_DIR=${STAGING_INCDIR} \
	-DProtobuf_LIBRARIES=${STAGING_LIBDIR} \
	-DPYTHON_INCLUDE_DIR=${STAGING_INCDIR}/${PYTHON_DIR} \
"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-pybind11 \
"

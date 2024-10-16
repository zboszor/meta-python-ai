SUMMARY = "Open Neural Network Exchange"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d273d63619c9aeaf15cdaf76422c4f87"

DEPENDS = " \
	python3-numpy-native python3-protobuf-native \
	python3-pytest-runner-native python3-cmake-native \
	python3-pybind11-native python3-pybind11 protobuf \
"

PYPI_PACKAGE = "onnx"

inherit pypi cmake python3native python_setuptools_build_meta

SRC_URI[sha256sum] = "48ca1a91ff73c1d5e3ea2eef20ae5d0e709bb8a2355ed798ffc2169753013fd3"

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

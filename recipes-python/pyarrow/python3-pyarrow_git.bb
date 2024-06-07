require arrow.inc

S = "${WORKDIR}/git/python"
LIC_FILES_CHKSUM = "file://../LICENSE.txt;md5=100c3e6324688e340080d7fd971b8c5e"

DEPENDS = " \
    apache-arrow \
    apache-arrow-native \
    python3-cython \
    python3-cython-native \
    python3-numpy \
    python3-numpy-native \
    python3-setuptools \
    python3-setuptools-native \
    python3-setuptools-scm \
    python3-setuptools-scm-native \
    "

inherit cmake python3native setuptools3

DISTUTILS_SETUP_PATH = "${S}"

OECMAKE_C_FLAGS += " -isystem ${WORKDIR}/git/cpp/src -DARROW_COMPUTE"
OECMAKE_CXX_FLAGS += " -isystem ${WORKDIR}/git/cpp/src -DARROW_COMPUTE"
SETUPTOOLS_BUILD_ARGS += " build_ext "
ARROWPYTHON_DIR = "${WORKDIR}/git/python/build/dist/lib/cmake/ArrowPython"
ARROW_PYTHON_INCLUDE_DIR = "${WORKDIR}/git/python/build/dist/include"
ARROW_PYTHON_LIB_DIR = "${WORKDIR}/git/python/build/dist/lib"

do_compile:prepend() {
    export CMAKE_SYSTEM_PROCESSOR="${HOST_ARCH}"
    export CMAKE_TOOLCHAIN_FILE="${WORKDIR}/toolchain.cmake"
    export PYARROW_BUILD_TYPE="Release"
    export PYARROW_CMAKE_OPTIONS=" -DCMAKE_SYSTEM_PROCESSOR=${HOST_ARCH} \
                                   -DCMAKE_TOOLCHAIN_FILE=${WORKDIR}/toolchain.cmake \
                                   -DGLIBCXX_USE_CXX11_ABI=0 \
                                   -DCMAKE_MODULE_PATH=${RECIPE_SYSROOT}${libdir}/cmake/arrow \
                                   -DArrowPython_DIR=${ARROWPYTHON_DIR} \
                                   -DARROW_PYTHON_INCLUDE_DIR=${ARROW_PYTHON_INCLUDE_DIR} \
                                   -DARROW_PYTHON_LIB_DIR=${ARROW_PYTHON_LIB_DIR} \
                                   "

    export ARROW_BUILD_DIR="${WORKDIR}/git/cpp/src"
    export PYARROW_CXXFLAGS="${OECMAKE_CXX_FLAGS}"
}

do_install:append:class-target() {
    ln -s ${libdir}/${PYTHON_DIR}/site-packages/pyarrow/libarrow_python.so.1000 ${D}${libdir}/
    ln -s ${libdir}/${PYTHON_DIR}/site-packages/pyarrow/libarrow_python.so.1000.1.0 ${D}${libdir}/
}

FILES:${PN}-staticdev += " ${libdir}/${PYTHON_DIR}/site-packages/pyarrow/libarrow_python.a "

BBCLASSEXTEND = "native nativesdk"

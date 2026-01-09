DESCRIPTION = "An open source light-weight and high performance inference framework for Hailo devices"
HOMEPAGE = "https://github.com/hailo-ai/hailort/tree/hailo8"
LICENSE = "MIT & LGPL-2.1-or-later"

DEPENDS = "python3-pybind11-native python3-pybind11 hailort8"

inherit python3native cmake setuptools3_legacy

LIC_FILES_CHKSUM = "file://../../../../LICENSE;md5=ed57bbf10be0c74ecf2c80710208b2b3"

SRC_URI = " \
	git://github.com/hailo-ai/hailort.git;protocol=https;branch=hailo8 \
	file://0001-Use-a-pre-built-pybind11-dependency.patch;patchdir=${S}/../../../../.. \
	file://0002-Set-CMAKE_VERBOSE_MAKEFILE-to-ON.patch;patchdir=${S}/../../../../.. \
	file://0003-Handle-more-settings-in-optional-cmake-arg-list.patch;patchdir=${S}/../../../../.. \
	file://0004-Use-the-renamed-hailort8cli-tool-in-base_utils.py.patch;patchdir=${S}/../../../../.. \
"

SRCREV = "08f088d3b443c7846af067269ce998c6d5d91449"

S .= "/hailort/libhailort/bindings/python/platform"

export CMAKE_TOOLCHAIN_FILE = "${WORKDIR}/toolchain.cmake"
export CMAKE_BUILD_TYPE = "RelWithDebInfo"
export CMAKE_POLICY_VERSION_MINIMUM = "3.10"
export PYBIND11_FINDPYTHON = "ON"
export PYBIND11_PYTHON_VERSION = "${PYTHON_BASEVERSION}"
export _PYBIND11_CROSSCOMPILING = "ON"
export Python_INCLUDE_DIR = "${PYTHON_INCLUDE_DIR}"
export Python_LIBRARY = "${PYTHON_LIBRARY}"
export HAILORT_INCLUDE_DIR = "${STAGING_INCDIR}"
export LIBHAILORT_PATH = "${STAGING_LIBDIR}/libhailort.so"

INSANE_SKIP:${PN}-dbg = "buildpaths"

RDEPENDS:${PN} = " \
	python3-appdirs \
	python3-argcomplete \
	python3-contextlib2 \
	python3-distlib \
	python3-filelock \
	python3-future \
	python3-importlib-metadata \
	python3-importlib-resources \
	python3-netaddr \
	python3-netifaces \
	python3-numpy \
	python3-typing-extensions \
	python3-virtualenv \
"

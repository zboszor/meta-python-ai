SUMMARY = "RAW image processing for Python, a wrapper for libraw"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=688f290dfec15c72e64beb1dc86d4660"

DEPENDS = "libraw python3-cmake-native python3-numpy-native python3-numpy"

inherit cmake pkgconfig python_setuptools_build_meta cython

SRC_URI = "git://github.com/letmaik/rawpy.git;protocol=https;branch=main"

# This is a post-0.26.1 commit that modernizes the build
SRCREV = "e333e155ade91578fbc2b0de059eec6483cb675d"

export CMAKE_ARGS = "-DCMAKE_TOOLCHAIN_FILE=${WORKDIR}/toolchain.cmake"
export VERBOSE = "1"

do_compile[network] = "1"

do_compile:append () {
	sed -i \
		-e 's:${RECIPE_SYSROOT_NATIVE}::g' \
		-e 's:${RECIPE_SYSROOT}::g' \
		${S}/rawpy/_rawpy.cpp
}

RDEPENDS:${PN} = "python3-numpy"

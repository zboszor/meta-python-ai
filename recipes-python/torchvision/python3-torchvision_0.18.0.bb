SUMMARY = "Datasets, Transforms and Models specific to Computer Vision"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bd7749a3307486a4d4bfefbc81c8b796"
DEPENDS = " \
	protobuf-native python3-pytorch-native python3-sympy-native \
	python3-numpy python3-pillow python3-pytorch \
	jpeg libpng ffmpeg \
"

inherit cmake pkgconfig python3native setuptools3_legacy

SRC_URI = " \
	git://github.com/pytorch/vision.git;protocol=https;branch=release/0.18 \
	file://0001-Use-pkg-config-to-detect-libpng.patch \
	file://0002-Pass-presence-and-version-of-ffmpeg-via-envvar.patch \
"

#PR = "r0"
SRCREV = "126fc22ce33e6c2426edcf9ed540810c178fe9ce"

S = "${WORKDIR}/git"

B = "${S}/build"

export CMAKE_TOOLCHAIN_FILE="${WORKDIR}/toolchain.cmake"
export TORCHVISION_INCLUDE="${STAGING_INCDIR}"
export TORCHVISION_USE_PNG = "1"
export TORCHVISION_USE_JPEG = "1"
export TORCHVISION_USE_FFMPEG = "1"
export FFMPEG_ROOT = "${STAGING_LIBDIR}/.."
export FFMPEG_VERSION = "6.0"

CXXFLAGS += " \
	-I${STAGING_INCDIR}/torch/csrc/api/include \
"

do_configure () {
	export EXTRA_OECMAKE="${EXTRA_OECMAKE}"
	setuptools3_legacy_do_configure
}

do_compile() {
	export EXTRA_OECMAKE="${EXTRA_OECMAKE}"
	setuptools3_legacy_do_compile
}

do_install () {
	export EXTRA_OECMAKE="${EXTRA_OECMAKE}"
	setuptools3_legacy_do_install
}

RDEPENDS:${PN} += " \
	python3-numpy python3-pillow python3-pytorch \
	ffmpeg \
"

SKIP_FILEDEPS:${PN} = '1'

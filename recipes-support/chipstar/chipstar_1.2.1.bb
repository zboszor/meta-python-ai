DESCRIPTION = "chipStar enables compiling and running HIP and \
CUDA applications on platforms which support SPIR-V as the device \
intermediate representation. It supports OpenCL and Level Zero as \
the low-level runtime alternatives."
HOMEPAGE = "https://github.com/CHIP-SPV/chipStar.git"
LICENSE = "MIT"

DEPENDS = " \
	llvm-native vim-native spirv-llvm-translator-native chrpath-native \
	virtual/opencl-icd opencl-headers libffi libedit zlib libxml2 \
"

DEPENDS:append:class-target = " \
	llvm clang-cross-${TARGET_ARCH} spirv-llvm-translator \
	chipstar-native \
"

inherit cmake

#PR = "r1"

LIC_FILES_CHKSUM = "file://LICENSE;md5=18c85a1e3dc7c297bc0ab9ed498ceb21"

SRC_URI = " \
	gitsm://github.com/CHIP-SPV/chipStar.git;protocol=https;branch=main \
	file://0001-Allow-detecting-LLVM-and-CLang-without-explicit-path.patch \
	file://0003-Remove-dump-usage-from-the-LLVM-pass.patch \
	file://0001-Fix-llvm-link-command.patch;patchdir=${S}/bitcode/ROCm-Device-Libs \
	file://0002-Use-target-clang-compiler-for-generating-bitcode-fil.patch;patchdir=${S}/bitcode/ROCm-Device-Libs \
"

SRC_URI:append:class-target = " \
	file://0002-Use-TARGET_SYS-for-offload-compile-options.patch \
	file://0004-Execute-the-native-hipcc-in-samples-ccompat.patch \
	file://0005-Use-native-hipcc-in-add_custom_command.patch \
	file://0006-Hide-source-and-build-directory.patch \
	file://0007-Remove-rpath-from-linker-options.patch \
	file://0003-Use-native-build-of-prepare-builtins.patch;patchdir=${S}/bitcode/ROCm-Device-Libs \
"

SRCREV = "d75c0180767d63bcd6c58948ba32123d48407138"

S = "${UNPACKDIR}/git"

PACKAGECONFIG:append:x86-64 = " levelzero"

PACKAGECONFIG[levelzero] = ",,level-zero"

# This causes a build problem in HIP tests
TUNE_CCARGS:remove:x86-64 = "-mfpmath=sse"

OECMAKE_EXTRA_ROOT_PATH = "${S}/HIP/tests/catch/external"

EXTRA_OECMAKE += " \
	-DTARGET_SYS=${TARGET_SYS} \
	-DCHIP_SET_RPATH=NO \
"

EXTRA_OECMAKE:append:class-target = " \
	-DCMAKE_BUILD_TYPE=Release \
	-DEXT_SOURCE_DIR='${prefix}/src/${BPN}-${PV}' \
	-DEXT_BUILD_DIR='${prefix}/src/${BPN}-${PV}' \
"

do_install:append () {
	# chipStar installs the complete set of OpenCL headers
	# which is provided by opencl-headers and opencl-clhpp
	# but it's a different version, which would cause an
	# LLVM build error complaining about OpenCL version mismatch.
	rm -rf ${D}${includedir}/CL

	mv ${D}${prefix}/cmake/CHIP ${D}${libdir}/cmake
	rmdir ${D}${prefix}/cmake

	ln -s cucc ${D}${bindir}/nvcc
}

do_install:append:class-native () {
	install -m755 ${B}/bitcode/ROCm-Device-Libs/utils/prepare-builtins/prepare-builtins ${D}${bindir}
}

do_install:append:class-target () {
	install -m644 ${S}/samples/hip-cuda/RecursiveGaussian/RecursiveGaussian_Input.bmp ${D}${bindir}/chip_spv_samples/
	install -m644 ${S}/samples/cuda_samples/2_Graphics/dwtHaar1D/data/signal.dat ${D}${bindir}/chip_spv_samples/cuda_samples
	install -m644 ${S}/samples/cuda_samples/2_Graphics/dwtHaar1D/data/regression.gold.dat ${D}${bindir}/chip_spv_samples/cuda_samples

	sed -i 's:^HIP_CLANG_PATH=.*$:HIP_CLANG_PATH=:' ${D}${datadir}/.hipInfo

	sed -i \
		-e 's:\(INTERFACE_LINK_DIRECTORIES.*\)${STAGING_LIBDIR};${STAGING_LIBDIR}\(.*\)$:\1${libdir}\2:' \
		-e 's:\(INTERFACE_LINK_LIBRARIES.*\)${STAGING_LIBDIR}/libze_loader.so;${STAGING_LIBDIR}/libOpenCL.so\(.*\)$:\1libze_loader.so;libOpenCL.so\2:' \
		${D}${libdir}/cmake/hip/hip-targets.cmake \
		${D}${libdir}/cmake/CHIP/CHIPTargets.cmake
}

PACKAGES =+ "${PN}-lib ${PN}-samples"

FILES:${PN} += " \
	${bindir}/.hipVersion \
	${datadir}/.hipInfo \
"

FILES:${PN}-lib = " \
	${libdir}/libCHIP.so \
	${libdir}/hip-device-lib/ \
	${libdir}/llvm/ \
"

FILES:${PN}-samples = " \
	${bindir}/chip_spv_samples/ \
"

TOOLCHAIN = "clang"

BBCLASSEXTEND = "native"

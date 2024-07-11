DESCRIPTION = "chipStar is a tool for compiling and running HIP/CUDA on SPIR-V via OpenCL or Level Zero APIs."
SUMMARY = "chipStar: CUDA/HIP over OpenCL or L0"
HOMEPAGE = "https://github.com/CHIP-SPV/chipStar/"
SECTION = "devel"
LICENSE = "MIT"

DEPENDS = " \
	vim-native llvm spirv-llvm-translator \
"

DEPENDS:append:class-native = " ocl-icd-native"

DEPENDS:append:class-target = " \
	virtual/opencl-icd spirv-llvm-translator-native \
	chipstar-native \
"

TOOLCHAIN = "clang"

inherit qemu cmake clang

LIC_FILES_CHKSUM = "file://LICENSE;md5=18c85a1e3dc7c297bc0ab9ed498ceb21"

SRC_URI = " \
	gitsm://github.com/CHIP-SPV/chipStar.git;protocol=https;nobranch=1 \
	file://0001-Fix-irif-CMakeLists.txt-to-find-llvm-link.patch;patchdir=${S}/bitcode/ROCm-Device-Libs \
	file://0001-Fix-executing-commands-in-opencl_bc_lib-macro-in-cma.patch;patchdir=${S}/bitcode/ROCm-Device-Libs \
"

SRC_URI:append:class-target = " \
	file://0001-Use-TARGET_SYS-for-offload-compiler-commands.patch \
	file://0001-Build-hipInfo-with-native-hipcc.patch \
	file://0001-Build-ccompat-with-native-hipcc.patch \
	file://0001-Eliminate-RPATH.patch \
	file://0001-H4I-HipBLAS-Don-t-set-CMAKE_INSTALL_RPATH.patch;patchdir=${S}/H4I-HipBLAS \
"

SRCREV = "2403b0b16d0e5c29d3ef8d5ad73387eb975be4e1"

S = "${WORKDIR}/git"

EXTRA_OECMAKE = " \
	-DLLVM_DIR=${STAGING_LIBDIR}/cmake/llvm \
	-DClang_DIR=${STAGING_LIBDIR}/cmake/clang \
	-DCatch2_DIR=${S}/HIP/tests/catch/external/Catch2/cmake/Catch2 \
	-DCHIP_ENABLE_NON_COMPLIANT_DEVICELIB_CODE=ON \
	-DCHIP_FAST_MATH=ON \
	-DCHIP_USE_INTEL_USM=ON \
"

EXTRA_OECMAKE:prepend:class-target = " \
	-DPREPARE_BUILTINS=${STAGING_BINDIR_NATIVE}/chipstar-prepare-builtins \
	-DCMAKE_CXX_COMPILER_PATH=${STAGING_BINDIR_NATIVE}/${TARGET_SYS}/${TARGET_PREFIX}clang++ \
	-DCMAKE_C_COMPILER_PATH=${STAGING_BINDIR_NATIVE}/${TARGET_SYS}/${TARGET_PREFIX}clang \
	-DTARGET_SYS=${TARGET_SYS} \
"

PACKAGECONFIG ?= ""

# Does not really work (yet?)
PACKAGECONFIG[hipblas] = "-DCHIP_BUILD_HIPBLAS=ON -DCMAKE_MODULE_PATH=${RECIPE_SYSROOT}/opt/intel/oneapi/compiler/2024.0/lib/cmake -DINTEL_COMPILER_PATH=${RECIPE_SYSROOT_NATIVE}/opt/intel/oneapi/compiler/2024.0/bin/icpx,-DCHIP_BUILD_HIPBLAS=OFF,intel-oneapi-dpcpp-cpp-native intel-oneapi-dpcpp-cpp-runtime-native intel-oneapi-mkl-native"

# Prevent "error: unknown FP unit 'sse'
TUNE_CCARGS:remove:x86-64:class-target = "-mfpmath=sse"

chipstar_enable_icpx () {
	if [ "${@bb.utils.contains('PACKAGECONFIG', 'hipblas', '1', '0', d)}" = "1" ]; then
		. ${RECIPE_SYSROOT_NATIVE}/opt/intel/oneapi/setvars.sh 
	fi
}

do_configure:prepend () {
	chipstar_enable_icpx
}

do_configure:prepend:class-target () {
	# Target build fails if it finds nvcc pointing to cucc
	#rm -f ${STAGING_BINDIR_NATIVE}/nvcc
}

do_configure:append:class-target () {
	sed -i \
		-e 's,${S},${prefix}/src/${PN}-${PV},' \
		-e 's,${B},${prefix}/src/${PN}-${PV}/build,' \
		${B}/include/chipStarConfig.hh
}

do_compile[network] = "1"

do_compile:prepend () {
	chipstar_enable_icpx
}

do_install:append () {
	mv ${D}${prefix}/cmake/* ${D}${libdir}/cmake/
	rmdir ${D}${prefix}/cmake
	chmod 0755 ${D}${libdir}/libCHIP.so

	# Fake nvcc
	ln -s cucc ${D}${bindir}/nvcc
}

do_install:append:class-target () {
	sed -i \
		-e 's,${STAGING_DIR_HOST},,' \
		-e 's,${STAGING_DIR_NATIVE},,' \
		${D}${bindir}/cuspvc \
		${D}${datadir}/.hipInfo \
		${D}${libdir}/cmake/*/*.cmake
}

do_install:append:class-native () {
	install -m0755 ${B}/bitcode/ROCm-Device-Libs/utils/prepare-builtins/prepare-builtins ${D}${bindir}/chipstar-prepare-builtins
}

SYSROOT_PREPROCESS_FUNCS += "chipstar_sysroot_preprocess"

chipstar_sysroot_preprocess () {
	install -d ${SYSROOT_DESTDIR}${bindir_crossscripts}/
	install -m 755 ${D}${bindir}/cucc ${SYSROOT_DESTDIR}${bindir_crossscripts}/
	ln -s cucc ${SYSROOT_DESTDIR}${bindir_crossscripts}/nvcc

	sed -i \
		-e 's,return "${prefix}",return os.environ["STAGING_EXECPREFIXDIR"],' \
		-e 's,return get_hip_path() + "/bin/hipcc",return os.environ["STAGING_BINDIR_NATIVE"] + "/hipcc",' \
		${SYSROOT_DESTDIR}${bindir_crossscripts}/cucc
}

PACKAGES =+ "${PN}-device-libs ${PN}-libs ${PN}-samples"

RDEPENDS:${PN} += "bash python3"

FILES:${PN}-device-libs = "${libdir}/hip-device-lib/"

FILES:${PN}-libs = "${libdir}/libCHIP.so ${libdir}/llvm/"
RDEPENDS:${PN}-libs += "${PN}-device-libs"

FILES:${PN}-samples = "${bindir}/chip_spv_samples"

FILES:${PN}-dev += "${bindir}/.hipVersion ${datadir}/.hipInfo"

BBCLASSEXTEND = "native"

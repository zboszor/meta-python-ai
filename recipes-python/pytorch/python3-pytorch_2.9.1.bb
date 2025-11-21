SUMMARY = "Tensors and Dynamic neural networks in Python with strong GPU acceleration"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d07280c7432af485bb23b7b316c5f3e5"

DEPENDS = " \
	coreutils-native git-native shaderc-native \
	python3-cmake-native python3-ninja-native python3-requests-native \
	python3-six-native python3-astunparse-native \
	python3-charset-normalizer-native python3-types-dataclasses-native \
	python3-future-native python3-cffi-native \
	python3-pyyaml-native python3-pybind11-native \
	python3-numpy-native python3-typing-extensions-native \
	sleef glslang gflags zstd \
"

DEPENDS:append:class-target = " \
	zstd-native numactl opencv \
	opencl-headers virtual/libopencl1 \
	shaderc spirv-tools mesa \
	${@bb.utils.contains('DISTRO_FEATURES', 'vulkan', 'vulkan-headers vulkan-loader', '', d)} \
	python3-numpy python3-typing-extensions python3-pyyaml \
	python3-pybind11 python3-pytorch-native \
"

inherit cmake python_setuptools_build_meta python3native

# Some gitsm:// has to be git:// due to errors in their upstream
# declaration:
# ERROR: python3-pytorch do_fetch: Fetcher failure: Submodule refers to the parent repository. This will cause deadlock situation in current version of Bitbake.Consider using git fetcher instead.

SRC_URI = " \
	git://github.com/pytorch/pytorch.git;protocol=https;name=pytorch;branch=release/2.9 \
	gitsm://github.com/facebookincubator/fbjni.git;protocol=https;name=fbjni;nobranch=1;destsuffix=${S}/android/libs/fbjni \
	gitsm://github.com/Maratyszcza/FP16.git;protocol=https;name=fp16;nobranch=1;destsuffix=${S}/third_party/FP16 \
	gitsm://github.com/Maratyszcza/FXdiv.git;protocol=https;name=fxdiv;nobranch=1;destsuffix=${S}/third_party/FXdiv \
	gitsm://github.com/Maratyszcza/NNPACK.git;protocol=https;name=nnpack;nobranch=1;destsuffix=${S}/third_party/NNPACK \
	gitsm://github.com/NVIDIA/NVTX.git;protocol=https;name=nvtx;nobranch=1;destsuffix=${S}/third_party/NVTX \
	gitsm://github.com/GPUOpen-LibrariesAndSDKs/VulkanMemoryAllocator.git;protocol=https;name=vulkanmemalloc;nobranch=1;destsuffix=${S}/third_party/VulkanMemoryAllocator \
	gitsm://github.com/google/XNNPACK.git;protocol=https;name=xnnpack;nobranch=1;destsuffix=${S}/third_party/XNNPACK \
	gitsm://github.com/ROCm/aiter.git;protocol=https;name=aiter;nobranch=1;destsuffix=${S}/third_party/aiter \
	gitsm://github.com/google/benchmark.git;protocol=https;name=benchmark;nobranch=1;destsuffix=${S}/third_party/benchmark \
	gitsm://github.com/ROCm/composable_kernel.git;protocol=https;name=composable_kernel;nobranch=1;destsuffix=${S}/third_party/composable_kernel \
	gitsm://github.com/yhirose/cpp-httplib.git;protocol=https;name=cpphttplib;nobranch=1;destsuffix=${S}/third_party/cpp-httplib \
	gitsm://github.com/pytorch/cpuinfo.git;protocol=https;name=cpuinfo;nobranch=1;destsuffix=${S}/third_party/cpuinfo \
	gitsm://github.com/NVIDIA/cudnn-frontend.git;protocol=https;name=cudnnfe;nobranch=1;destsuffix=${S}/third_party/cudnn_frontend \
	gitsm://github.com/NVIDIA/cutlass.git;protocol=https;name=cutlass;nobranch=1;destsuffix=${S}/third_party/cutlass \
	gitsm://github.com/pytorch/FBGEMM.git;protocol=https;name=fbgemm;nobranch=1;destsuffix=${S}/third_party/fbgemm \
	gitsm://github.com/Dao-AILab/flash-attention.git;protocol=https;name=flash_attention;nobranch=1;destsuffix=${S}/third_party/flash-attention \
	gitsm://github.com/google/flatbuffers.git;protocol=https;name=flatbuffers;nobranch=1;destsuffix=${S}/third_party/flatbuffers \
	gitsm://github.com/fmtlib/fmt.git;protocol=https;name=fmt;nobranch=1;destsuffix=${S}/third_party/fmt \
	gitsm://github.com/google/gemmlowp.git;protocol=https;name=gemmlowp;nobranch=1;destsuffix=${S}/third_party/gemmlowp/gemmlowp \
	gitsm://github.com/facebookincubator/gloo.git;protocol=https;name=gloo;nobranch=1;destsuffix=${S}/third_party/gloo \
	gitsm://github.com/google/googletest.git;protocol=https;name=gtest;nobranch=1;destsuffix=${S}/third_party/googletest \
	gitsm://github.com/intel/ideep.git;protocol=https;name=ideep;nobranch=1;destsuffix=${S}/third_party/ideep \
	gitsm://github.com/oneapi-src/oneDNN.git;protocol=https;name=ideep_onednn;nobranch=1;destsuffix=${S}/third_party/ideep/mkl-dnn \
	gitsm://github.com/intel/ittapi.git;protocol=https;name=ittapi;nobranch=1;destsuffix=${S}/third_party/ittapi \
	git://github.com/pytorch/kineto.git;protocol=https;name=kineto;nobranch=1;destsuffix=${S}/third_party/kineto \
	git://github.com/facebookincubator/dynolog.git;protocol=https;name=kineto_dynolog;nobranch=1;destsuffix=${S}/third_party/kineto/libkineto/third_party/dynolog \
	gitsm://github.com/NVIDIA/DCGM.git;protocol=https;name=kineto_dynolog_dcgm;nobranch=1;destsuffix=${S}/third_party/kineto/libkineto/third_party/dynolog/third_party/DCGM \
	gitsm://github.com/libcpr/cpr.git;protocol=https;name=kineto_dynolog_cpr;nobranch=1;destsuffix=${S}/third_party/kineto/libkineto/third_party/dynolog/third_party/cpr \
	gitsm://github.com/fmtlib/fmt.git;protocol=https;name=kineto_dynolog_fmt;nobranch=1;destsuffix=${S}/third_party/kineto/libkineto/third_party/dynolog/third_party/fmt \
	git://github.com/gflags/gflags.git;protocol=https;name=kineto_dynolog_gflags;nobranch=1;destsuffix=${S}/third_party/kineto/libkineto/third_party/dynolog/third_party/gflags \
	gitsm://github.com/gflags/gflags.git;protocol=https;name=kineto_dynolog_gflags_doc;branch=gh-pages;destsuffix=${S}/third_party/kineto/libkineto/third_party/dynolog/third_party/gflags/doc \
	gitsm://github.com/google/glog.git;protocol=https;name=kineto_dynolog_glog;nobranch=1;destsuffix=${S}/third_party/kineto/libkineto/third_party/dynolog/third_party/glog \
	gitsm://github.com/google/googletest.git;protocol=https;name=kineto_dynolog_gtest;nobranch=1;destsuffix=${S}/third_party/kineto/libkineto/third_party/dynolog/third_party/googletest \
	gitsm://github.com/nlohmann/json.git;protocol=https;name=kineto_dynolog_json;nobranch=1;destsuffix=${S}/third_party/kineto/libkineto/third_party/dynolog/third_party/json \
	gitsm://github.com/dtrugman/pfs.git;protocol=https;name=kineto_dynolog_pfs;nobranch=1;destsuffix=${S}/third_party/kineto/libkineto/third_party/dynolog/third_party/pfs \
	gitsm://github.com/fmtlib/fmt.git;protocol=https;name=kineto_fmt;nobranch=1;destsuffix=${S}/third_party/kineto/libkineto/third_party/fmt \
	gitsm://github.com/google/googletest.git;protocol=https;name=kineto_gtest;nobranch=1;destsuffix=${S}/third_party/kineto/libkineto/third_party/googletest \
	gitsm://github.com/ARM-software/kleidiai.git;protocol=https;name=kleidiai;nobranch=1;destsuffix=${S}/third_party/kleidiai \
	gitsm://github.com/microsoft/mimalloc.git;protocol=https;name=mimalloc;nobranch=1;destsuffix=${S}/third_party/mimalloc \
	gitsm://github.com/NVIDIA/nccl.git;protocol=https;name=nccl;nobranch=1;destsuffix=${S}/third_party/nccl/nccl \
	gitsm://github.com/nlohmann/json.git;protocol=https;name=nlohmann;nobranch=1;destsuffix=${S}/third_party/nlohmann \
	gitsm://github.com/onnx/onnx.git;protocol=https;name=onnx;nobranch=1;destsuffix=${S}/third_party/onnx \
	gitsm://github.com/open-telemetry/opentelemetry-cpp.git;protocol=https;name=otmcpp;nobranch=1;destsuffix=${S}/third_party/opentelemetry-cpp \
	gitsm://github.com/mreineck/pocketfft.git;protocol=https;name=pocketfft;nobranch=1;destsuffix=${S}/third_party/pocketfft \
	gitsm://github.com/protocolbuffers/protobuf.git;protocol=https;name=protobuf;nobranch=1;destsuffix=${S}/third_party/protobuf \
	gitsm://github.com/google/benchmark.git;protocol=https;name=protobuf_benchmark;nobranch=1;destsuffix=${S}/third_party/protobuf/third_party/benchmark \
	gitsm://github.com/google/googletest.git;protocol=https;name=protobuf_gtest;nobranch=1;destsuffix=${S}/third_party/protobuf/third_party/googletest \
	gitsm://github.com/Maratyszcza/psimd.git;protocol=https;name=psimd;nobranch=1;destsuffix=${S}/third_party/psimd \
	gitsm://github.com/Maratyszcza/pthreadpool.git;protocol=https;name=pthreadpool;nobranch=1;destsuffix=${S}/third_party/pthreadpool \
	gitsm://github.com/pybind/pybind11.git;protocol=https;name=pybind11;nobranch=1;destsuffix=${S}/third_party/pybind11 \
	gitsm://github.com/malfet/PeachPy.git;protocol=https;name=peachpy;nobranch=1;destsuffix=${S}/third_party/python-peachpy \
	gitsm://github.com/shibatch/sleef.git;protocol=https;name=sleef;nobranch=1;destsuffix=${S}/third_party/sleef \
	gitsm://github.com/pytorch/tensorpipe.git;protocol=https;name=tensorpipe;nobranch=1;destsuffix=${S}/third_party/tensorpipe \
	file://0001-Use-oneDNN-using-its-new-CMake-name.patch \
	file://0001-opentelemetry-cpp-tools-vcpkg-Use-oneDNN-using-its-n.patch;patchdir=third_party/opentelemetry-cpp/tools/vcpkg \
	file://0005-Use-IsGoogleLoggingInitialized-from-the-Google-publi.patch \
	file://0001-Pass-through-EXTRA_OECMAKE.patch \
	file://pytorch-fix-vulkan-get_shader-return-type.patch \
	file://fix-non-void-funcs-with-switch.patch \
	file://0001-Don-t-specify-maximum-setuptools-version.patch \
	file://0001-Delete-some-values-from-macros.h.in.patch \
	file://0001-Fix-Wincompatible-pointer-types-issues.patch;patchdir=third_party/XNNPACK \
"

#PR = "r1"

SRCREV_FORMAT = "pytorch"
SRCREV_pytorch = "d38164a545b4a4e4e0cf73ce67173f70574890b6"

# These are the git submodule commit IDs
SRCREV_fbjni = "7e1e1fe3858c63c251c637ae41a20de425dde96f"
SRCREV_fp16 = "4dfe081cf6bcd15db339cf2680b9281b8451eeb3"
SRCREV_fxdiv = "b408327ac2a15ec3e43352421954f5b1967701d1"
SRCREV_nnpack = "c07e3a0400713d546e0dea2d5466dd22ea389c73"
SRCREV_nvtx = "2942f167cc30c5e3a44a2aecd5b0d9c07ff61a07"
SRCREV_vulkanmemalloc = "1d8f600fd424278486eade7ed3e877c99f0846b1"
SRCREV_xnnpack = "51a0103656eff6fc9bfd39a4597923c4b542c883"
SRCREV_aiter = "01aae101b9e5e94d6c16a9514c9fb8df99c93150"
SRCREV_benchmark = "299e5928955cc62af9968370293b916f5130916f"
SRCREV_composable_kernel = "7fe50dc3da2069d6645d9deb8c017a876472a977"
SRCREV_cpphttplib = "89c932f313c6437c38f2982869beacc89c2f2246"
SRCREV_cpuinfo = "5e3d2445e6a84d9599bee2bf78edbb4d80865e1d"
SRCREV_cudnnfe = "243c7ff63be1ce6dd5bf9047668b5d4de83f55f6"
SRCREV_cutlass = "e51efbfe18fe4f4cbb66ab814c55bf4aa0185491"
SRCREV_fbgemm = "4b39c551efe15e6bbade20565b0ceb2d8ce3352d"
SRCREV_flash_attention = "979702c87a8713a8e0a5e9fee122b90d2ef13be5"
SRCREV_flatbuffers = "a2cd1ea3b6d3fee220106b5fed3f7ce8da9eb757"
SRCREV_fmt = "40626af88bd7df9a5fb80be7b25ac85b122d6c21"
SRCREV_gemmlowp = "3fb5c176c17c765a3492cd2f0321b0dab712f350"
SRCREV_gloo = "54cbae0d3a67fa890b4c3d9ee162b7860315e341"
SRCREV_gtest = "52eb8108c5bdec04579160ae17225d66034bd723"
SRCREV_ideep = "719d8e6cd7f7a0e01b155657526d693acf97c2b3"
SRCREV_ideep_onednn = "8d263e693366ef8db40acc569cc7d8edf644556d"
SRCREV_ittapi = "dec1d23ca65ab069d225dfe40dea14f455170959"
SRCREV_kineto = "5e7501833f1021ce6f618572d3baf657b6319658"
SRCREV_kineto_dynolog = "7d04a0053a845370ae06ce317a22a48e9edcc74e"
SRCREV_kineto_dynolog_dcgm = "ffde4e54bc7249a6039a5e6b45b395141e1217f9"
SRCREV_kineto_dynolog_cpr = "871ed52d350214a034f6ef8a3b8f51c5ce1bd400"
SRCREV_kineto_dynolog_fmt = "cd4af11efc9c622896a3e4cb599fa28668ca3d05"
SRCREV_kineto_dynolog_gflags = "e171aa2d15ed9eb17054558e0b3a6a413bb01067"
SRCREV_kineto_dynolog_gflags_doc = "8411df715cf522606e3b1aca386ddfc0b63d34b4"
SRCREV_kineto_dynolog_glog = "b33e3bad4c46c8a6345525fd822af355e5ef9446"
SRCREV_kineto_dynolog_gtest = "58d77fa8070e8cec2dc1ed015d66b454c8d78850"
SRCREV_kineto_dynolog_json = "4f8fba14066156b73f1189a2b8bd568bde5284c5"
SRCREV_kineto_dynolog_pfs = "f68a2fa8ea36c783bdd760371411fcb495aa3150"
SRCREV_kineto_fmt = "0041a40c1350ba702d475b9c4ad62da77caea164"
SRCREV_kineto_gtest = "7aca84427f224eeed3144123d5230d5871e93347"
SRCREV_kleidiai = "cca02c2f69dd18e1f12647c1c0bdc8cf90e680c7"
SRCREV_mimalloc = "fbd8b99c2b828428947d70fdc046bb55609be93e"
SRCREV_nccl = "3ea7eedf3b9b94f1d9f99f4e55536dfcbd23c1ca"
SRCREV_nlohmann = "55f93686c01528224f448c19128836e7df245f72"
SRCREV_onnx = "e709452ef2bbc1d113faf678c24e6d3467696e83"
SRCREV_otmcpp = "a799f4aed9c94b765dcdaabaeab7d5e7e2310878"
SRCREV_pocketfft = "0fa0ef591e38c2758e3184c6c23e497b9f732ffa"
SRCREV_protobuf = "d1eca4e4b421cd2997495c4b4e65cea6be4e9b8a"
SRCREV_protobuf_benchmark = "5b7683f49e1e9223cf9927b24f6fd3d6bd82e3f8"
SRCREV_protobuf_gtest = "5ec7f0c4a113e2f18ac2c6cc7df51ad6afc24081"
SRCREV_psimd = "072586a71b55b7f8c584153d223e95687148a900"
SRCREV_pthreadpool = "4fe0e1e183925bf8cfa6aae24237e724a96479b8"
SRCREV_pybind11 = "f5fbe867d2d26e4a0a9177a51f6e568868ad3dc8"
SRCREV_peachpy = "f45429b087dd7d5bc78bb40dc7cf06425c252d67"
SRCREV_sleef = "5a1d179df9cf652951b59010a2d2075372d67f68"
SRCREV_tensorpipe = "af0118d13e52f5a08841464a768e01a0bf3e3075"

B = "${S}/build"

# -fpermissive is for const vs non-const declarations used from sleef
# -D_LARGEFILE64_SOURCE is needed for the embedded miniz
CXXFLAGS += " \
	-fpermissive \
	-D_LARGEFILE64_SOURCE \
	-I${S}/third_party/ideep/mkl-dnn/include \
	-I${S}/third_party/ideep/include \
	-I${S}/caffe2/mobile/contrib/libopencl-stub/include \
	-Wno-error=maybe-uninitialized \
	-Wno-error=uninitialized \
"

BUILD_CXXFLAGS += " \
	-fpermissive \
	-D_LARGEFILE64_SOURCE \
	-I${S}/third_party/ideep/mkl-dnn/include \
	-I${S}/third_party/ideep/include \
	-I${S}/caffe2/mobile/contrib/libopencl-stub/include \
	-Wno-error=maybe-uninitialized \
	-Wno-error=uninitialized \
"

CFLAGS += " \
	-D_LARGEFILE64_SOURCE \
	-I${S}/third_party/ideep/mkl-dnn/include \
	-I${S}/third_party/ideep/include \
	-I${S}/caffe2/mobile/contrib/libopencl-stub/include \
	-Wno-error=maybe-uninitialized \
	-Wno-error=uninitialized \
"

BUILD_CFLAGS += " \
	-D_LARGEFILE64_SOURCE \
	-I${S}/third_party/ideep/mkl-dnn/include \
	-I${S}/third_party/ideep/include \
	-I${S}/caffe2/mobile/contrib/libopencl-stub/include \
	-Wno-error=maybe-uninitialized \
	-Wno-error=uninitialized \
"

# Leave these variables below un-indented.
# The contents of EXTRA_OECMAKE is split in python code,
# which expects a single space between pieces.

EXTRA_OECMAKE_ARCH_FLAGS ?= "\
-DBLAS=Eigen"

EXTRA_OECMAKE = "\
-DC_HAS_AVX_2_EXITCODE=0 -DC_HAS_AVX_2_EXITCODE__TRYRUN_OUTPUT='' \
-DC_HAS_AVX2_2_EXITCODE=0 -DC_HAS_AVX2_2_EXITCODE__TRYRUN_OUTPUT='' \
-DC_HAS_AVX512_2_EXITCODE=0 -DC_HAS_AVX512_2_EXITCODE__TRYRUN_OUTPUT='' \
-DCXX_HAS_AVX_2_EXITCODE=0 -DCXX_HAS_AVX_2_EXITCODE__TRYRUN_OUTPUT='' \
-DCXX_HAS_AVX2_2_EXITCODE=0 -DCXX_HAS_AVX2_2_EXITCODE__TRYRUN_OUTPUT='' \
-DCXX_HAS_AVX512_2_EXITCODE=0 -DCXX_HAS_AVX512_2_EXITCODE__TRYRUN_OUTPUT='' \
-DSTAGING_LIBDIR=${STAGING_LIBDIR} \
-DWERROR=OFF \
-DPYTHON_LIBRARY=${STAGING_DIR}/${libdir}/${PYTHON_DIR} \
-DPYTHON_INCLUDE_DIR=${PYTHON_INCLUDE_DIR} \
-DGLIBCXX_USE_CXX11_ABI=1 \
${EXTRA_OECMAKE_ARCH_FLAGS} \
-DUSE_ITT=OFF \
-DUSE_CUDA=OFF \
-DUSE_FFMPEG=OFF \
-DBUILD_CAFFE2=ON \
-DBUILD_CAFFE2_OPS=ON \
-DCAFFE2_CUSTOM_PROTOC_EXECUTABLE=${STAGING_DIR_NATIVE}${PYTHON_SITEPACKAGES_DIR}/torch/bin/protoc \
-DUSE_SYSTEM_SLEEF=ON \
-DUSE_GOLD_LINKER=ON \
-DUSE_GFLAGS=ON \
-DUSE_GLOG=OFF \
-DUSE_OPENCL=ON \
-DUSE_OPENCV=ON \
-DUSE_VULKAN=${@bb.utils.contains('DISTRO_FEATURES', 'vulkan', 'ON', 'OFF', d)} \
-DUSE_VULKAN_FP16_INFERENCE=${@bb.utils.contains('DISTRO_FEATURES', 'vulkan', 'ON', 'OFF', d)} \
-DUSE_VULKAN_RELAXED_PRECISION=${@bb.utils.contains('DISTRO_FEATURES', 'vulkan', 'ON', 'OFF', d)} \
-DUSE_VULKAN_SHADERC_RUNTIME=${@bb.utils.contains('DISTRO_FEATURES', 'vulkan', 'ON', 'OFF', d)}"

EXTRA_OECMAKE:class-native = "\
-DSTAGING_LIBDIR=${STAGING_LIBDIR} \
-DWERROR=OFF \
-DPYTHON_LIBRARY=${STAGING_DIR}/${libdir}/${PYTHON_DIR} \
-DPYTHON_INCLUDE_DIR=${PYTHON_INCLUDE_DIR} \
-DGLIBCXX_USE_CXX11_ABI=1 \
-DBLAS=Eigen \
-DUSE_ITT=OFF \
-DUSE_CUDA=OFF \
-DUSE_FFMPEG=OFF \
-DBUILD_CAFFE2=OFF \
-DBUILD_CAFFE2_OPS=OFF \
-DUSE_SYSTEM_SLEEF=ON \
-DUSE_GFLAGS=ON \
-DUSE_GLOG=OFF \
-DUSE_OPENCL=OFF \
-DUSE_OPENCV=OFF \
-DUSE_VULKAN=OFF \
-DONNX_ML=OFF"

export CMAKE_TOOLCHAIN_FILE = "${WORKDIR}/toolchain.cmake"

do_configure:prepend () {
	export EXTRA_OECMAKE="${EXTRA_OECMAKE}"
}

do_compile:prepend () {
	export EXTRA_OECMAKE="${EXTRA_OECMAKE}"
}

do_install:prepend () {
	export EXTRA_OECMAKE="${EXTRA_OECMAKE}"
}

do_install:append () {
	( cd ${D}${libdir} ; ln -s ${PYTHON_DIR}/site-packages/torch/lib/lib*.so . )

	sed -i 's:set(ATEN_INCLUDE_DIR "${S}/torch/include"):set(ATEN_INCLUDE_DIR "${PYTHON_SITEPACKAGES_DIR}/torch/include"):' ${D}${PYTHON_SITEPACKAGES_DIR}/torch/share/cmake/ATen/ATenConfig.cmake
}

PRIVATE_LIBS = " \
	libbackend_with_compiler.so \
	libc10.so \
	libcaffe2_detectron_ops.so \
	libcaffe2_module_test_dynamic.so \
	libcaffe2_observers.so \
	libjitbackend_test.so \
	libshm.so \
	libtorchbind_test.so \
	libtorch_cpu.so \
	libtorch_global_deps.so \
	libtorch_python.so \
	libtorch.so \
"

FILES:${PN}-dev:remove = "${FILES_SOLIBSDEV}"

FILES:${PN} += " \
	${libdir}/*.so \
"

INSANE_SKIP:${PN} = "dev-so"

RDEPENDS:${PN}:class-target = " \
	sleef glslang gflags zstd \
	tbb numactl opencv \
	shaderc spirv-tools ${@bb.utils.contains('DISTRO_FEATURES', 'vulkan', 'vulkan-loader', '', d)} \
	python3-numpy python3-typing-extensions \
	python3-pyyaml python3-pybind11 \
	python3-sympy python3-six python3-onnx \
"

INSANE_SKIP:${PN} = "dev-so already-stripped"
INSANE_SKIP:${PN}-dbg = "buildpaths"
SKIP_FILEDEPS:${PN} = '1'

PARALLEL_MAKE = "-j ${@(int)(oe.utils.cpu_count()/2) + 1}"

BBCLASSEXTEND = "native"

SUMMARY = "Tensors and Dynamic neural networks in Python with strong GPU acceleration"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5c853508d63a8090fa952ff1af58217d"

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
	zstd-native glog numactl opencv \
	opencl-headers virtual/opencl-icd \
	shaderc spirv-tools mesa \
	${@bb.utils.contains('DISTRO_FEATURES', 'vulkan', 'vulkan-headers vulkan-loader', '', d)} \
	python3-numpy python3-typing-extensions python3-pyyaml \
	python3-pybind11 python3-pytorch-native \
"

inherit cmake python3native setuptools3_legacy

# Some gitsm:// has to be git:// due to errors in their upstream
# declaration:
# ERROR: python3-pytorch do_fetch: Fetcher failure: Submodule refers to the parent repository. This will cause deadlock situation in current version of Bitbake.Consider using git fetcher instead.

SRC_URI = " \
	git://github.com/pytorch/pytorch.git;protocol=https;name=pytorch;branch=release/2.4 \
	gitsm://github.com/facebookincubator/fbjni.git;protocol=https;name=fbjni;nobranch=1;destsuffix=git/android/libs/fbjni \
	gitsm://github.com/Maratyszcza/FP16.git;protocol=https;name=fp16;nobranch=1;destsuffix=git/third_party/FP16 \
	gitsm://github.com/Maratyszcza/FXdiv.git;protocol=https;name=fxdiv;nobranch=1;destsuffix=git/third_party/FXdiv \
	gitsm://github.com/Maratyszcza/NNPACK.git;protocol=https;name=nnpack;nobranch=1;destsuffix=git/third_party/NNPACK \
	gitsm://github.com/GPUOpen-LibrariesAndSDKs/VulkanMemoryAllocator.git;protocol=https;name=vulkanmemalloc;nobranch=1;destsuffix=git/third_party/VulkanMemoryAllocator \
	gitsm://github.com/google/XNNPACK.git;protocol=https;name=xnnpack;nobranch=1;destsuffix=git/third_party/XNNPACK \
	gitsm://github.com/google/benchmark.git;protocol=https;name=benchmark;nobranch=1;destsuffix=git/third_party/benchmark \
	gitsm://github.com/yhirose/cpp-httplib.git;protocol=https;name=cpphttplib;nobranch=1;destsuffix=git/third_party/cpp-httplib \
	gitsm://github.com/pytorch/cpuinfo.git;protocol=https;name=cpuinfo;nobranch=1;destsuffix=git/third_party/cpuinfo \
	gitsm://github.com/NVIDIA/cudnn-frontend.git;protocol=https;name=cudnnfe;nobranch=1;destsuffix=git/third_party/cudnn_frontend \
	gitsm://github.com/NVIDIA/cutlass.git;protocol=https;name=cutlass;nobranch=1;destsuffix=git/third_party/cutlass \
	gitsm://gitlab.com/libeigen/eigen.git;protocol=https;name=eigen;nobranch=1;destsuffix=git/third_party/eigen \
	gitsm://github.com/pytorch/FBGEMM.git;protocol=https;name=fbgemm;nobranch=1;destsuffix=git/third_party/fbgemm \
	gitsm://github.com/google/flatbuffers.git;protocol=https;name=flatbuffers;nobranch=1;destsuffix=git/third_party/flatbuffers \
	gitsm://github.com/fmtlib/fmt.git;protocol=https;name=fmt;nobranch=1;destsuffix=git/third_party/fmt \
	gitsm://github.com/houseroad/foxi.git;protocol=https;name=foxi;nobranch=1;destsuffix=git/third_party/foxi \
	gitsm://github.com/google/gemmlowp.git;protocol=https;name=gemmlowp;nobranch=1;destsuffix=git/third_party/gemmlowp/gemmlowp \
	gitsm://github.com/facebookincubator/gloo.git;protocol=https;name=gloo;nobranch=1;destsuffix=git/third_party/gloo \
	gitsm://github.com/google/googletest.git;protocol=https;name=gtest;nobranch=1;destsuffix=git/third_party/googletest \
	gitsm://github.com/intel/ideep.git;protocol=https;name=ideep;nobranch=1;destsuffix=git/third_party/ideep \
	gitsm://github.com/oneapi-src/oneDNN.git;protocol=https;name=ideep_onednn;nobranch=1;destsuffix=git/third_party/ideep/mkl-dnn \
	gitsm://github.com/intel/ittapi.git;protocol=https;name=ittapi;nobranch=1;destsuffix=git/third_party/ittapi \
	git://github.com/pytorch/kineto.git;protocol=https;name=kineto;nobranch=1;destsuffix=git/third_party/kineto \
	git://github.com/facebookincubator/dynolog.git;protocol=https;name=kineto_dynolog;nobranch=1;destsuffix=git/third_party/kineto/libkineto/third_party/dynolog \
	gitsm://github.com/NVIDIA/DCGM.git;protocol=https;name=kineto_dynolog_dcgm;nobranch=1;destsuffix=git/third_party/kineto/libkineto/third_party/dynolog/third_party/DCGM \
	gitsm://github.com/libcpr/cpr.git;protocol=https;name=kineto_dynolog_cpr;nobranch=1;destsuffix=git/third_party/kineto/libkineto/third_party/dynolog/third_party/cpr \
	gitsm://github.com/fmtlib/fmt.git;protocol=https;name=kineto_dynolog_fmt;nobranch=1;destsuffix=git/third_party/kineto/libkineto/third_party/dynolog/third_party/fmt \
	git://github.com/gflags/gflags.git;protocol=https;name=kineto_dynolog_gflags;nobranch=1;destsuffix=git/third_party/kineto/libkineto/third_party/dynolog/third_party/gflags \
	gitsm://github.com/gflags/gflags.git;protocol=https;name=kineto_dynolog_gflags_doc;branch=gh-pages;destsuffix=git/third_party/kineto/libkineto/third_party/dynolog/third_party/gflags/doc \
	gitsm://github.com/google/glog.git;protocol=https;name=kineto_dynolog_glog;nobranch=1;destsuffix=git/third_party/kineto/libkineto/third_party/dynolog/third_party/glog \
	gitsm://github.com/google/googletest.git;protocol=https;name=kineto_dynolog_gtest;nobranch=1;destsuffix=git/third_party/kineto/libkineto/third_party/dynolog/third_party/googletest \
	gitsm://github.com/nlohmann/json.git;protocol=https;name=kineto_dynolog_json;nobranch=1;destsuffix=git/third_party/kineto/libkineto/third_party/dynolog/third_party/json \
	gitsm://github.com/dtrugman/pfs.git;protocol=https;name=kineto_dynolog_pfs;nobranch=1;destsuffix=git/third_party/kineto/libkineto/third_party/dynolog/third_party/pfs \
	gitsm://github.com/fmtlib/fmt.git;protocol=https;name=kineto_fmt;nobranch=1;destsuffix=git/third_party/kineto/libkineto/third_party/fmt \
	gitsm://github.com/google/googletest.git;protocol=https;name=kineto_gtest;nobranch=1;destsuffix=git/third_party/kineto/libkineto/third_party/googletest \
	gitsm://github.com/microsoft/mimalloc.git;protocol=https;name=mimalloc;nobranch=1;destsuffix=git/third_party/mimalloc \
	gitsm://github.com/NVIDIA/nccl.git;protocol=https;name=nccl;nobranch=1;destsuffix=git/third_party/nccl/nccl \
	gitsm://github.com/nlohmann/json.git;protocol=https;name=nlohmann;nobranch=1;destsuffix=git/third_party/nlohmann \
	gitsm://github.com/onnx/onnx.git;protocol=https;name=onnx;nobranch=1;destsuffix=git/third_party/onnx \
	gitsm://github.com/open-telemetry/opentelemetry-cpp.git;protocol=https;name=otmcpp;nobranch=1;destsuffix=git/third_party/opentelemetry-cpp \
	gitsm://github.com/mreineck/pocketfft.git;protocol=https;name=pocketfft;nobranch=1;destsuffix=git/third_party/pocketfft \
	gitsm://github.com/protocolbuffers/protobuf.git;protocol=https;name=protobuf;nobranch=1;destsuffix=git/third_party/protobuf \
	gitsm://github.com/google/benchmark.git;protocol=https;name=protobuf_benchmark;nobranch=1;destsuffix=git/third_party/protobuf/third_party/benchmark \
	gitsm://github.com/google/googletest.git;protocol=https;name=protobuf_gtest;nobranch=1;destsuffix=git/third_party/protobuf/third_party/googletest \
	gitsm://github.com/Maratyszcza/psimd.git;protocol=https;name=psimd;nobranch=1;destsuffix=git/third_party/psimd \
	gitsm://github.com/Maratyszcza/pthreadpool.git;protocol=https;name=pthreadpool;nobranch=1;destsuffix=git/third_party/pthreadpool \
	gitsm://github.com/pybind/pybind11.git;protocol=https;name=pybind11;nobranch=1;destsuffix=git/third_party/pybind11 \
	gitsm://github.com/malfet/PeachPy.git;protocol=https;name=peachpy;nobranch=1;destsuffix=git/third_party/python-peachpy \
	gitsm://github.com/shibatch/sleef.git;protocol=https;name=sleef;nobranch=1;destsuffix=git/third_party/sleef \
	gitsm://github.com/pytorch/tensorpipe.git;protocol=https;name=tensorpipe;nobranch=1;destsuffix=git/third_party/tensorpipe \
	file://0003-Use-oneDNN-using-its-new-CMake-name.patch \
	file://0005-Use-IsGoogleLoggingInitialized-from-the-Google-publi.patch \
	file://0001-Pass-through-EXTRA_OECMAKE.patch \
	file://pytorch-fix-vulkan-get_shader-return-type.patch \
	file://fix-non-void-funcs-with-switch.patch \
	file://0001-Use-CMAKE_INSTALL_PREFIX-to-install-python-files.patch \
	file://0001-Delete-some-values-from-macros.h.in.patch \
"

#PR = "r1"

SRCREV_FORMAT = "pytorch"
SRCREV_pytorch = "ee1b6804381c57161c477caa380a840a84167676"

# These are the git submodule commit IDs
SRCREV_fbjni = "7e1e1fe3858c63c251c637ae41a20de425dde96f"
SRCREV_fp16 = "4dfe081cf6bcd15db339cf2680b9281b8451eeb3"
SRCREV_fxdiv = "b408327ac2a15ec3e43352421954f5b1967701d1"
SRCREV_nnpack = "c07e3a0400713d546e0dea2d5466dd22ea389c73"
SRCREV_vulkanmemalloc = "a6bfc237255a6bac1513f7c1ebde6d8aed6b5191"
SRCREV_xnnpack = "fcbf55af6cf28a4627bcd1f703ab7ad843f0f3a2"
SRCREV_benchmark = "0d98dba29d66e93259db7daa53a9327df767a415"
SRCREV_cpphttplib = "3b6597bba913d51161383657829b7e644e59c006"
SRCREV_cpuinfo = "d6860c477c99f1fce9e28eb206891af3c0e1a1d7"
SRCREV_cudnnfe = "b740542818f36857acf7f9853f749bbad4118c65"
SRCREV_cutlass = "bbe579a9e3beb6ea6626d9227ec32d0dae119a49"
SRCREV_eigen = "3147391d946bb4b6c68edd901f2add6ac1f31f8c"
SRCREV_fbgemm = "dbc3157bf256f1339b3fa1fef2be89ac4078be0e"
SRCREV_flatbuffers = "01834de25e4bf3975a9a00e816292b1ad0fe184b"
SRCREV_fmt = "e69e5f977d458f2650bb346dadf2ad30c5320281"
SRCREV_foxi = "c278588e34e535f0bb8f00df3880d26928038cad"
SRCREV_gemmlowp = "3fb5c176c17c765a3492cd2f0321b0dab712f350"
SRCREV_gloo = "5354032ea08eadd7fc4456477f7f7c6308818509"
SRCREV_gtest = "e2239ee6043f73722e7aa812a459f54a28552929"
SRCREV_ideep = "55ca0191687aaf19aca5cdb7881c791e3bea442b"
SRCREV_ideep_onednn = "1137e04ec0b5251ca2b4400a4fd3c667ce843d67"
SRCREV_ittapi = "5b8a7d7422611c3a0d799fb5fc5dd4abfae35b42"
SRCREV_kineto = "be1317644c68b4bfc4646024a6b221066e430031"
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
SRCREV_kineto_fmt = "a33701196adfad74917046096bf5a2aa0ab0bb50"
SRCREV_kineto_gtest = "7aca84427f224eeed3144123d5230d5871e93347"
SRCREV_mimalloc = "b66e3214d8a104669c2ec05ae91ebc26a8f5ab78"
SRCREV_nccl = "48bb7fec7953112ff37499a272317f6663f8f600"
SRCREV_nlohmann = "87cda1d6646592ac5866dc703c8e1839046a6806"
SRCREV_onnx = "990217f043af7222348ca8f0301e17fa7b841781"
SRCREV_otmcpp = "a799f4aed9c94b765dcdaabaeab7d5e7e2310878"
SRCREV_pocketfft = "9d3ab05a7fffbc71a492bc6a17be034e83e8f0fe"
SRCREV_protobuf = "d1eca4e4b421cd2997495c4b4e65cea6be4e9b8a"
SRCREV_protobuf_benchmark = "5b7683f49e1e9223cf9927b24f6fd3d6bd82e3f8"
SRCREV_protobuf_gtest = "5ec7f0c4a113e2f18ac2c6cc7df51ad6afc24081"
SRCREV_psimd = "072586a71b55b7f8c584153d223e95687148a900"
SRCREV_pthreadpool = "4fe0e1e183925bf8cfa6aae24237e724a96479b8"
SRCREV_pybind11 = "3e9dfa2866941655c56877882565e7577de6fc7b"
SRCREV_peachpy = "f45429b087dd7d5bc78bb40dc7cf06425c252d67"
SRCREV_sleef = "60e76d2bce17d278b439d9da17177c8f957a9e9b"
SRCREV_tensorpipe = "52791a2fd214b2a9dc5759d36725909c1daa7f2e"

S = "${UNPACKDIR}/git"
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
-DUSE_GLOG=ON \
-DUSE_OPENCL=OFF \
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

export CMAKE_TOOLCHAIN_FILE="${WORKDIR}/toolchain.cmake"

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
	tbb glog numactl opencv \
	shaderc spirv-tools ${@bb.utils.contains('DISTRO_FEATURES', 'vulkan', 'vulkan-loader', '', d)} \
	python3-numpy python3-typing-extensions \
	python3-pyyaml python3-pybind11 \
	python3-sympy python3-six python3-onnx \
"

INSANE_SKIP:${PN} = "dev-so already-stripped"
SKIP_FILEDEPS:${PN} = '1'

BBCLASSEXTEND = "native"
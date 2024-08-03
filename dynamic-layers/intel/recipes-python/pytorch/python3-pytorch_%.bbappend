DEPENDS:append:x86-64 = " intel-oneapi-mkl intel-oneapi-dpcpp-cpp onednn"
RDEPENDS:append:x86-64 = " intel-oneapi-mkl intel-oneapi-dpcpp-cpp-runtime onednn"

LDFLAGS:append:class-target:x86-64 = " -ldnnl"
BUILD_LDFLAGS:append:class-target:x86-64 = " -ldnnl"

EXTRA_OECMAKE_ARCH_FLAGS:x86-64 = "\
-DBLAS=MKL \
-DBLAS_MKLDNN=ON \
-DUSE_MKLDNN_CBLAS=ON \
-DBUILD_ONEDNN_GRAPH=ON"

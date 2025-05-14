DEPENDS:append:class-target:x86-64 = " intel-oneapi-mkl intel-oneapi-dpcpp-cpp onednn"
RDEPENDS:${PN}:append:class-target:x86-64 = " intel-oneapi-mkl intel-oneapi-dpcpp-cpp-runtime onednn"

EXTRA_OECMAKE_ARCH_FLAGS:class-target:x86-64 = "\
-DMKL_ROOT=${RECIPE_SYSROOT} \
-DBLAS=MKL \
-DBLAS_MKLDNN=ON \
-DUSE_MKLDNN=ON \
-DUSE_MKLDNN_CBLAS=ON \
-DBUILD_ONEDNN_GRAPH=ON \
-DDNNL_EXPERIMENTAL_UKERNEL=ON"

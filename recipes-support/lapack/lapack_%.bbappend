DEPENDS += "openblas"
DEPENDS:remove:class-native = "libgfortran"

EXTRA_OECMAKE += " -DUSE_OPTIMIZED_BLAS=1"

BBCLASSEXTEND = "native"

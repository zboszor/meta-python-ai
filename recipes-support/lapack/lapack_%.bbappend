DEPENDS += "openblas"
DEPENDS:remove:class-native = "libgfortran"

EXTRA_OECMAKE += " -DUSE_OPTIMIZED_BLAS=1"

do_install:append () {
	# The version number of the lapack cmake dir
	# should be computed. PV = 3.12.1 -> 3.12.0
	sed -i 's:${RECIPE_SYSROOT}::' ${D}${libdir}/cmake/lapack-3.12.0/lapack-config.cmake
}

BBCLASSEXTEND = "native"

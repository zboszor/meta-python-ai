SUMMARY = "ECMWF's GRIB and BUFR decoding/encoding library"
DESCRIPTION = "ECMWF's GRIB and BUFR decoding/encoding library"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=49a885bb73a876a14aa665d7343a63ee"

SRC_URI += " \
	git://github.com/ecmwf/eccodes.git;protocol=https;branch=master \
	file://0001-Disable-warnings-for-grib_types.f90-grib_f90.f90.patch \
	file://0001-Add-fallow-argument-mismatch-fortran-flag-unconditio.patch \
	file://0001-Use-the-proper-Jasper-define-for-the-major-version.patch \
"

SRCREV = "aa85928d05036a1bce3cab330bc75681dc26c234"

DEPENDS = "ecbuild-native libgfortran netcdf-c libaec libpng jasper openjpeg"

inherit cmake-qemu python3native

EXTRA_OECMAKE = " \
	-DCMAKE_Fortran_FLAGS='${OECMAKE_C_FLAGS}' \
	-DIEEE_BE_EXITCODE=1 \
	-DIEEE_LE_EXITCODE=0 \
	-DENABLE_RPATHS=OFF \
	-DENABLE_TESTS=OFF \
	-DENABLE_EXAMPLES=OFF \
	-DENABLE_PNG=ON \
	-DENABLE_ALIGN_MEMORY=ON \
	-DENABLE_MEMFS=ON \
	-DENABLE_ECCODES_THREADS=ON \
	-DENABLE_MEMORY_MANAGEMENT=ON \
"

do_install:append () {
	sed -i \
		-e 's:--sysroot=${RECIPE_SYSROOT} ::' \
		-e 's:-ffile-prefix-map=${S}=[^ ]* ::' \
		-e 's:-ffile-prefix-map=${B}=[^ ]* ::' \
		-e 's:-ffile-prefix-map=${RECIPE_SYSROOT_NATIVE}=[^ ]* ::' \
		-e 's:-ffile-prefix-map=${RECIPE_SYSROOT}=[^ ]* ::' \
		-e 's:${STAGING_BINDIR_TOOLCHAIN}/::' \
		-e 's:"${RECIPE_SYSROOT_NATIVE}/:"/:' \
		-e 's:${S}:${TARGET_DBGSRC_DIR}:' \
		-e 's:${B}:${TARGET_DBGSRC_DIR}:' \
		${D}${bindir}/codes_config \
		${D}${includedir}/eccodes_ecbuild_config.h

	sed -i \
		-e 's:${RECIPE_SYSROOT}${libdir}/libm.so:\${_IMPORT_PREFIX}/${BASELIB}/libm.so:' \
		${D}${libdir}/cmake/eccodes/eccodes-targets.cmake

	sed -i \
		-e 's:${STAGING_BINDIR_TOOLCHAIN}/::' \
		-e 's:-l${RECIPE_SYSROOT}[^ ]*/lib\([^\.]*\).so:-l\1:g' \
		${D}${libdir}/pkgconfig/*.pc
}

PACKAGE_BEFORE_PN = "${PN}-tools"
FILES:${PN}-tools = "${bindir}/*"
FILES:${PN}-dev = "${includedir} ${libdir}/cmake ${libdir}/pkgconfig ${bindir}/codes_config"
FILES:${PN} += "${libdir}/*.so"

# libeccodes_f90.so contains TMPDIR references even after strip
INSANE_SKIP:${PN} = "dev-so buildpaths"
INSANE_SKIP:${PN}-dbg = "buildpaths"

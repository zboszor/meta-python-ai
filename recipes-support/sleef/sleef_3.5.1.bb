SUMMARY = "SIMD Library for Evaluating Elementary Functions, vectorized libm and DFT"
DESCRIPTION = "SIMD Library for Evaluating Elementary Functions, vectorized libm and DFT"
LICENSE = "BSL-1.0"
LIC_FILES_CHKSUM = "file://${S}/LICENSE.txt;md5=e4224ccaecb14d942c71d31bef20d78c  "

PR = "r1"

S = "${WORKDIR}/git"

SRCREV = "85440a5e87dae36ca1b891de14bc83b441ae7c43"

SRC_URI = " \
	git://github.com/shibatch/sleef.git;protocol=https;nobranch=1 \
	file://471.patch \
"

DEPENDS = "gmp mpfr fftw openssl"
DEPENDS:append:class-target = " sleef-native"

inherit cmake

EXTRA_OECMAKE = " \
	-DBUILD_TESTS=OFF \
	-DBUILD_DFT=ON \
	-DBUILD_QUAD=ON \
"

EXTRA_OECMAKE:append:class-target = " \
	-DNATIVE_BUILD_DIR=${STAGING_BINDIR_NATIVE}/.. \
	-DBUILD_SCALAR_LIB=ON \
"

BBCLASSEXTEND = "native nativesdk"

SYSROOT_PREPROCESS_FUNCS:append:class-native = " sleep_sysroot_preprocess"

sleep_sysroot_preprocess() {
	install -d ${SYSROOT_DESTDIR}${bindir}
	install -m 755 ${B}/bin/* ${SYSROOT_DESTDIR}${bindir}
}

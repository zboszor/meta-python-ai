SUMMARY = "SIMD Library for Evaluating Elementary Functions, vectorized libm and DFT"
DESCRIPTION = "SIMD Library for Evaluating Elementary Functions, vectorized libm and DFT"
LICENSE = "BSL-1.0"
LIC_FILES_CHKSUM = "file://${S}/LICENSE.txt;md5=e4224ccaecb14d942c71d31bef20d78c  "

#PR = "r1"

S = "${WORKDIR}/git"

SRCREV = "6ee14bcae5fe92c2ff8b000d5a01102dab08d774"

SRC_URI = " \
	git://github.com/shibatch/sleef.git;protocol=https;nobranch=1 \
"

DEPENDS = "gmp mpfr fftw openssl"
DEPENDS:append:class-target = " sleef-native"

inherit cmake

EXTRA_OECMAKE = " \
	-DSLEEF_BUILD_SHARED_LIBS=ON \
	-DSLEEF_BUILD_TESTS=OFF \
	-DSLEEF_BUILD_DFT=ON \
	-DSLEEF_BUILD_QUAD=ON \
	-DSLEEF_BUILD_GNUABI_LIBS=OFF \
"

EXTRA_OECMAKE:append:class-target = " \
	-DNATIVE_BUILD_DIR=${STAGING_BINDIR_NATIVE}/.. \
	-DSLEEF_BUILD_SCALAR_LIB=ON \
"

BBCLASSEXTEND = "native nativesdk"

SYSROOT_PREPROCESS_FUNCS:append:class-native = " sleep_sysroot_preprocess"

sleep_sysroot_preprocess() {
	install -d ${SYSROOT_DESTDIR}${bindir}
	install -m 755 ${B}/bin/* ${SYSROOT_DESTDIR}${bindir}
}

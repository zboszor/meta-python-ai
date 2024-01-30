DESCRIPTION = "Apache Arrow is a multi-language toolbox for accelerated data interchange and in-memory processing"
HOMEPAGE = "https://github.com/apache/arrow"
LICENSE = "Apache-2.0"

DEPENDS = " \
	protobuf boost zlib bzip2 lz4 zstd openssl brotli \
	snappy orc glog gflags utf8proc re2 rapidjson \
"

inherit cmake python3native

#PR = "r1"

LIC_FILES_CHKSUM = "file://../LICENSE.txt;md5=8031a2c33230c952ed3f3ccff1d3fa89"

SRC_URI = "git://github.com/apache/arrow.git;protocol=https;branch=maint-${PV}"

SRCREV = "a61f4af724cd06c3a9b4abd20491345997e532c0"

S = "${WORKDIR}/git/cpp"

EXTRA_OECMAKE = " \
	-DARROW_DEPENDENCY_SOURCE=SYSTEM \
	-DARROW_USE_BOOST=ON \
	-DARROW_USE_OPENSSL=ON \
	-DARROW_WITH_BROTLI=ON \
	-DARROW_WITH_BZ2=ON \
	-DARROW_WITH_LZ4=ON \
	-DARROW_WITH_SNAPPY=ON \
	-DARROW_WITH_ZLIB=ON \
	-DARROW_WITH_ZSTD=ON \
	-DARROW_WITH_UTF8PROC=ON \
	-DARROW_WITH_RE2=ON \
	-DARROW_ORC=OFF \
	-DARROW_USE_GLOG=ON \
	-DARROW_SIMD_LEVEL=NONE \
	-DARROW_RUNTIME_SIMD_LEVEL=NONE \
	-DARROW_JEMALLOC=OFF \
	-DARROW_CSV=ON \
	-DARROW_COMPUTE=ON \
	-DARROW_DATASET=ON \
	-DARROW_FILESYSTEM=ON \
	-DARROW_JSON=ON \
"

do_compile:prepend () {
	# fix for qa check buildpaths
	sed -i \
		-e "s#${DEBUG_PREFIX_MAP}##g" \
		-e "s#--sysroot=${RECIPE_SYSROOT}##g" \
		${B}/src/arrow/util/config.h
}

do_install:append () {
	# fix for qa check buildpaths
	sed -i "s#${STAGING_LIBDIR}#\$\{libdir\}#g" \
		${D}${libdir}/pkgconfig/arrow.pc
}

FILES:${PN}-dbg += "${datadir}/gdb ${datadir}/arrow/gdb"

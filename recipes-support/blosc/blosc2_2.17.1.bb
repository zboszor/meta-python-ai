DESCRIPTION = "A fast, compressed, persistent binary data store library for C"
HOMEPAGE = "https://github.com/Blosc/c-blosc2"
LICENSE = "BSD-3-Clause"

DEPENDS = "lz4 zlib zstd"

inherit cmake

#PR = "r1"

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=06e852077699178e4248d905b3846a4b"

SRC_URI = "git://github.com/Blosc/c-blosc2.git;protocol=https;branch=main"

SRCREV = "5fcd6fbf9ffcf613fabdb1eb3a90eeb12f7c04fe"


#OECMAKE_GENERATOR = "Unix Makefiles"

EXTRA_OECMAKE = " \
	-DBUILD_STATIC:BOOL=OFF \
	-DPREFER_EXTERNAL_LZ4:BOOL=ON \
	-DTEST_INCLUDE_BENCH_SUITE:BOOL=OFF \
	-DPREFER_EXTERNAL_ZLIB:BOOL=ON \
	-DPREFER_EXTERNAL_ZSTD:BOOL=ON \
"

do_install:append:class-target () {
	sed -i \
		-e 's|;${STAGING_INCDIR}||g' \
		-e 's|${STAGING_LIBDIR}/||g' \
		-e 's|libzstd.so|zstd|g' \
		-e 's|liblz4.so|lz4|g' \
		-e 's|libz.so|z|g' \
		${D}${libdir}/cmake/Blosc2/Blosc2Targets.cmake
}

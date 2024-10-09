DESCRIPTION = "High performance compressor optimized for binary data"
HOMEPAGE = "https://github.com/Blosc/c-blosc"
LICENSE = "BSD-3-Clause"

DEPENDS = "lz4 zlib zstd"

inherit cmake

#PR = "r1"

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=06e852077699178e4248d905b3846a4b"

SRC_URI = "git://github.com/Blosc/c-blosc.git;protocol=https;branch=main"

SRCREV = "616f4b7343a8479f7e71dd3d7025bd92c9a6bbd0"

S = "${UNPACKDIR}/git"

#OECMAKE_GENERATOR = "Unix Makefiles"

EXTRA_OECMAKE = " \
	-DBUILD_STATIC:BOOL=OFF \
	-DPREFER_EXTERNAL_LZ4:BOOL=ON \
	-DTEST_INCLUDE_BENCH_SUITE:BOOL=OFF \
	-DDEACTIVATE_SNAPPY:BOOL=OFF \
	-DPREFER_EXTERNAL_ZLIB:BOOL=ON \
	-DPREFER_EXTERNAL_ZSTD:BOOL=ON \
"

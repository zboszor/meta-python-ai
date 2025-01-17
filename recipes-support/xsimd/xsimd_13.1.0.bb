DESCRIPTION = "C++ wrappers for SIMD intrinsics and parallelized, optimized mathematical functions (SSE, AVX, AVX512, NEON, SVE)"
HOMEPAGE = "https://github.com/xtensor-stack/xsimd"
LICENSE = "BSD-3-Clause"

inherit cmake

#PR = "r1"

LIC_FILES_CHKSUM = "file://LICENSE;md5=fdd4d7dc8bdd9ae7181dd0bca68007a2"

SRC_URI = "git://github.com/xtensor-stack/xsimd.git;protocol=https;branch=master"

SRCREV = "148fa1328c674ab2ee1d03b1460204671ae82a8b"

S = "${UNPACKDIR}/git"

BBCLASSEXTEND = "native nativesdk"

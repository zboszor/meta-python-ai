#
#   Copyright (c) 2016 Intel Corporation. All rights reserved.
#   Copyright (c) 2019 Luxoft Sweden AB
#
#   SPDX-License-Identifier: MIT
#

DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version."
SUMMARY = "OpenBLAS : An optimized BLAS library"
AUTHOR = "Alexander Leiva <norxander@gmail.com>"
HOMEPAGE = "http://www.openblas.net/"
SECTION = "libs"
LICENSE = "BSD-3-Clause"

DEPENDS:class-target = "libgfortran"
DEPENDS:class-native = ""

inherit cmake

LIC_FILES_CHKSUM = "file://LICENSE;md5=5adf4792c949a00013ce25d476a2abc0"

SRC_URI = " \
	git://github.com/xianyi/OpenBLAS.git;protocol=https;branch=develop \
	file://0001-Add-forgotten-conditional-uses-of-PREFETCH.patch \
"

SRCREV = "ce3f668c992cb3cc80849d5c30ed637f5adbd5b2"

S = "${WORKDIR}/git"

# Used for TARGET=... , documented in TargetList.txt
BLAS_X86_ARCH ?= "ATOM"
BLAS_AARCH32_ARCH ?= "CORTEXA9"
BLAS_AARCH64_ARCH ?= "ARMV8"
BLAS_ARM_ARCH ?= "ARMV7"

def map_arch(a, d):
        import re
        if re.match('i.86$', a): return d.getVar('BLAS_X86_ARCH')
        elif re.match('x86_64$', a): return d.getVar('BLAS_X86_ARCH')
        elif re.match('aarch32$', a): return d.getVar('BLAS_AARCH32_ARCH')
        elif re.match('aarch64$', a): return d.getVar('BLAS_AARCH64_ARCH')
        elif re.match('arm$', a): return d.getVar('BLAS_ARM_ARCH')
        return a

def map_bits(a, d):
        import re
        if re.match('i.86$', a): return 32
        elif re.match('x86_64$', a): return 64
        elif re.match('aarch32$', a): return 32
        elif re.match('aarch64$', a): return 64
        elif re.match('arm$', a): return 32
        return 32

def map_extra_options(a, d):
        import re
        if re.match('arm$', a): return '-mfpu=neon-vfpv4 -mfloat-abi=hard'
        return ''

EXTRA_OECMAKE = " \
	-DBUILD_SHARED_LIBS=ON \
	-DBUILD_STATIC_LIBS=OFF \
	-DBINARY='${@map_bits(d.getVar('TARGET_ARCH', True), d)}' \
	-DTARGET='${@map_arch(d.getVar('TARGET_ARCH', True), d)}' \
"

PACKAGECONFIG[lapack] = "-DBUILD_WITHOUT_LAPACK=OFF,-DBUILD_WITHOUT_LAPACK=ON"
PACKAGECONFIG[lapack-deprecated] = "-DBUILD_LAPACK_DEPRECATED=ON,-DBUILD_LAPACK_DEPRECATED=OFF"
PACKAGECONFIG[cblas] = "-DBUILD_WITHOUT_CBLAS=OFF,-DBUILD_WITHOUT_CBLAS=ON"
PACKAGECONFIG[affinity] = "-DNO_AFFINITY=OFF,-DNO_AFFINITY=ON"
PACKAGECONFIG[openmp] = "-DUSE_OPENMP=ON,-DUSE_OPENMP=OFF,openmp"
PACKAGECONFIG[dynarch] = "-DDYNAMIC_ARCH=ON,-DDYNAMIC_ARCH=OFF"

PACKAGECONFIG ??= "openmp"

BBCLASSEXTEND = "native"

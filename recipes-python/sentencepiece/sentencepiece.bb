SUMMARY = "Unsupervised text tokenizer for Neural Network-based text generation"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

require sentencepiece.inc

SRC_URI += "file://0001-Bump-cmake_minimum_required-to-satisfy-CMake-4.0.patch"

inherit cmake

PACKAGE_BEFORE_PN = "${PN}-utils"

FILES:${PN}-utils = "${bindir}/spm_*"

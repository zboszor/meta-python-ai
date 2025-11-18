SUMMARY = "Unsupervised text tokenizer and detokenizer"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://../LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS = "protobuf sentencepiece"

inherit pkgconfig python_setuptools_build_meta

require sentencepiece.inc

SRC_URI += "file://0001-Do-not-strip-the-python-shared-object.patch;striplevel=2"

S:append = "/python"

SUMMARY = "Query metadata from sdists / bdists / installed packages"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6fc86b61c6077306ca1f5edc8edcc490"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "5cd957824ac36f140260964eba3c6be6442a8359b8c48f4adf90210f33a04b7b"

BBCLASSEXTEND = "native nativesdk"

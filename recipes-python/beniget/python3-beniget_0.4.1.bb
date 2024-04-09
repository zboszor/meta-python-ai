SUMMARY = "A static analyzer for Python2 and Python3 code"
HOMEPAGE = "https://github.com/serge-sans-paille/beniget/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=02550c296a72ab0b70961eb70a5a7242"

inherit pypi setuptools3

SRC_URI[sha256sum] = "75554b3b8ad0553ce2f607627dad3d95c60c441189875b98e097528f8e23ac0c"

BBCLASSEXTEND = "native"

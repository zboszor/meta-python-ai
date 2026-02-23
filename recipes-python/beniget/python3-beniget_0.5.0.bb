SUMMARY = "A static analyzer for Python2 and Python3 code"
HOMEPAGE = "https://github.com/serge-sans-paille/beniget/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3fa25649b59601013383ef6b92fd2f59"

inherit pypi setuptools3

SRC_URI[sha256sum] = "e7af11fa8ec7de3d3eb3d98b1e722d15d44017d8b35d8aa11d54f6719b312f22"

BBCLASSEXTEND = "native"

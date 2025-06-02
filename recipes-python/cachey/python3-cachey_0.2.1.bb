SUMMARY = "Caching mindful of computation/storage costs"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=01cbb2369bb5a7c865b5a165065dabb9"

PYPI_PACKAGE = "cachey"

inherit pypi setuptools3
SRC_URI[sha256sum] = "0310ba8afe52729fa7626325c8d8356a8421c434bf887ac851e58dcf7cf056a6"

RDEPENDS:${PN} = "python3-heapdict"

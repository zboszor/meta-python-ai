DESCRIPTION = "C++ implementation of a fast hash map and hash set using robin hood hashing"
HOMEPAGE = "https://github.com/Tessil/robin-map"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7d9128c23e4bdb36bdceedce604442e0"

inherit cmake

SRC_URI = "git://github.com/Tessil/robin-map.git;protocol=https;branch=master"
SRCREV = "bd14e6830a1474fed9d2d03f5c3b0683d818d540"

EXTRA_OECMAKE = "-DTSL_ROBIN_MAP_ENABLE_INSTALL=ON"

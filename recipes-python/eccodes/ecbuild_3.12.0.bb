SUMMARY = "A CMake-based build system, consisting of a collection of CMake macros and functions that ease the managing of software build systems"
DESCRIPTION = "A CMake-based build system, consisting of a collection of CMake macros and functions that ease the managing of software build systems"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8a7dd6768ae68db43ba399dad354a06c"

SRCREV = "60e7d659ec10a4316e0ec27be28254092dcd7921"

SRC_URI = "git://github.com/ecmwf/ecbuild.git;protocol=https;branch=master"

inherit cmake

do_install:append () {
	sed -i 's:${S}:${TARGET_DBGSRC_DIR}:' ${D}${libdir}/cmake/ecbuild/ecbuild-post-import.cmake
}

RDEPENDS:${PN} += "bash"

BBCLASSEXTEND = "native"

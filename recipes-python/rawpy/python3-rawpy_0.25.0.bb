SUMMARY = "RAW image processing for Python, a wrapper for libraw"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=688f290dfec15c72e64beb1dc86d4660"

DEPENDS = "libraw python3-numpy-native python3-numpy"

inherit setuptools3 pkgconfig

SRC_URI = "git://github.com/letmaik/rawpy.git;protocol=https;branch=main"
SRCREV = "d3e258759fe3aa12aadf6f54726247fc9d5d0b46"


do_compile:append () {
	sed -i \
		-e 's:${RECIPE_SYSROOT_NATIVE}::g' \
		-e 's:${RECIPE_SYSROOT}::g' \
		${S}/rawpy/_rawpy.cpp
}

RDEPENDS:${PN} = "python3-numpy"

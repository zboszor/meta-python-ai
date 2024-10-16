SUMMARY = "Image transformation, compression, and decompression codecs"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a234723b439c69716295c522ab084190"

DEPENDS = " \
	python3-numpy-native \
	libpng brotli bzip2 lcms giflib libjpeg-turbo openjpeg \
	blosc libaec libdeflate lz4 xz tiff libwebp zlib zstd \
	cfitsio snappy \
"

PYPI_PACKAGE = "imagecodecs"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "0f3e94b7f51e2f78287b7ffae82cd850b1007639148894538274fa50bd179886"

SRC_URI += "file://fix-includes.patch"

do_install:prepend () {
	sed -i 's:${RECIPE_SYSROOT}::g' ${S}/imagecodecs/_jpeg2k.c
}

RDEPENDS:${PN} = "python3-numpy python3-numcodecs"

export INCLIB = "${STAGING_LIBDIR}/.."

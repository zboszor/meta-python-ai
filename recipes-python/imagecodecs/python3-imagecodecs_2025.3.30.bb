SUMMARY = "Image transformation, compression, and decompression codecs"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bd3f4aa88257f86c235a1ff1b8f311fd"

DEPENDS = " \
	python3-numpy-native \
	libpng brotli bzip2 lcms giflib libjpeg-turbo openjpeg \
	blosc blosc2 libaec libdeflate lz4 xz tiff libwebp zlib zstd \
	cfitsio snappy libavif libheif lzo \
"

PYPI_PACKAGE = "imagecodecs"

inherit pypi python_setuptools_build_meta cython
SRC_URI[sha256sum] = "29256f44a7fcfb8f235a3e9b3bae72b06ea2112e63bcc892267a8c01b7097f90"

SRC_URI += "file://fix-includes.patch"

do_install:prepend () {
	sed -i 's:${RECIPE_SYSROOT}::g' ${S}/imagecodecs/_jpeg2k.c
}

RDEPENDS:${PN} = "python3-numpy python3-numcodecs"

export INCLIB = "${STAGING_LIBDIR}/.."

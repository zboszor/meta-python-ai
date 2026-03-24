SUMMARY = "Image transformation, compression, and decompression codecs"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=228837c3a3eda31fb28d51e82dd7a225"

DEPENDS = " \
	python3-numpy-native \
	libpng brotli bzip2 lcms giflib libjpeg-turbo openjpeg \
	blosc blosc2 libaec libdeflate lz4 xz tiff libwebp zlib zstd \
	cfitsio snappy libavif libheif lzo \
"

PYPI_PACKAGE = "imagecodecs"

inherit pypi python_setuptools_build_meta cython
SRC_URI[sha256sum] = "471b8a4d1b3843cbf7179b45f7d7261f0c0b28809efc1ca6c47822477b143b85"

SRC_URI += "file://fix-includes.patch"

RDEPENDS:${PN} = "python3-numpy python3-numcodecs"

export INCLIB = "${STAGING_LIBDIR}/.."

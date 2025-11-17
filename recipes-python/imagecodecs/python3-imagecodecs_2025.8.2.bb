SUMMARY = "Image transformation, compression, and decompression codecs"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fab05479c81115b143f2d9daabf46fa7"

DEPENDS = " \
	python3-numpy-native \
	libpng brotli bzip2 lcms giflib libjpeg-turbo openjpeg \
	blosc blosc2 libaec libdeflate lz4 xz tiff libwebp zlib zstd \
	cfitsio snappy libavif libheif lzo \
"

PYPI_PACKAGE = "imagecodecs"

inherit pypi python_setuptools_build_meta cython
SRC_URI[sha256sum] = "2af272aac90c370326a7e2fffcbbbd32d42de07576959a2a98d60110267dfe6c"

SRC_URI += "file://fix-includes.patch"

RDEPENDS:${PN} = "python3-numpy python3-numcodecs"

export INCLIB = "${STAGING_LIBDIR}/.."

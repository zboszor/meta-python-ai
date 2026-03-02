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
SRC_URI[sha256sum] = "e37ef5116d41ba90b1c9d1d7121846671fd65c271f0c15ef24208353fa79b283"

SRC_URI += "file://fix-includes.patch"

RDEPENDS:${PN} = "python3-numpy python3-numcodecs"

export INCLIB = "${STAGING_LIBDIR}/.."

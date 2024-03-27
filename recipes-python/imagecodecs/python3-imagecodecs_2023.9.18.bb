SUMMARY = "Image transformation, compression, and decompression codecs"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a3db077904b1929962456dbf04420fc3"

DEPENDS = " \
	python3-numpy-native \
	libpng brotli bzip2 lcms giflib libjpeg-turbo openjpeg \
	blosc libaec libdeflate lz4 xz tiff libwebp zlib zstd \
	cfitsio snappy \
"

PYPI_PACKAGE = "imagecodecs"

inherit pypi setuptools3
SRC_URI[sha256sum] = "bf4b4be4759fc3b27b5022228aada83e735744e4b7c204bcdccaa961c3f79d4d"

SRC_URI += "file://disable-plugins.patch"

RDEPENDS:${PN} = "python3-numpy python3-numcodecs"

export INCLIB = "${STAGING_LIBDIR}/.."

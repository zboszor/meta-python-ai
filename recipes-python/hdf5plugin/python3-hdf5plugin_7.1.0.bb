SUMMARY = "hdf5plugin provides HDF5 compression filters (namely: Blosc, Blosc2, BitShuffle, BZip2, Htj2k, FciDecomp, LZ4, Sperr, SZ, SZ3, Zfp, ZStd) and makes them usable from h5py."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4cae5e41ed0c765777b66f9fdba504b4"

DEPENDS = "python3-py-cpuinfo-native"

PYPI_PACKAGE = "hdf5plugin"

inherit pypi python_setuptools_build_meta 
SRC_URI[sha256sum] = "dc4aa9576bf5770d773be9309a060ccf2f0ce2f0031f2b369f566d2662ec2fb3"

RDEPENDS:${PN} = "python3-h5py"

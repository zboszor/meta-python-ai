SUMMARY = "ml_dtypes is a stand-alone implementation of several NumPy dtype extensions used in machine learning."
DESCRIPTION = "ml_dtypes is a stand-alone implementation of several NumPy dtype extensions used in machine learning."
LICENSE = "Apache-2.0 & MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://LICENSE.eigen;md5=f75d2927d3c1ed2414ef72048f5ad640"

DEPENDS = "python3-numpy-native python3-numpy"

PYPI_PACKAGE = "ml_dtypes"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "8ab06a50fb9bf9666dd0fe5dfb4676fa2b0ac0f31ecff72a6c3af8e22c063453"

RDEPENDS:${PN} = "python3-numpy"

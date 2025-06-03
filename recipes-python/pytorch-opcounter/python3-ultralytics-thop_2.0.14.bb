SUMMARY = "Ultralytics THOP package for fast computation of PyTorch model FLOPs and parameters."
LICENSE = "AGPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4ae09d45eac4aa08d013b5f2e01c67f6"

DEPENDS = "python3-numpy-native"

inherit pypi python_setuptools_build_meta

PYPI_PACKAGE = "ultralytics_thop"
SRC_URI[sha256sum] = "38ebfdbd3cd8dafdc3d26ec3a7d4f604fbeed5e69a74e61a48060b39736c945c"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-pytorch \
"

RPROVIDES:${PN} = "python3-pytorch-opcounter"

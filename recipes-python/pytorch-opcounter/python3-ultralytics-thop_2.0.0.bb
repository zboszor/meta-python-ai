SUMMARY = "Ultralytics THOP package for fast computation of PyTorch model FLOPs and parameters."
LICENSE = "AGPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4ae09d45eac4aa08d013b5f2e01c67f6"

DEPENDS = "python3-numpy-native"

inherit pypi python_setuptools_build_meta

PYPI_PACKAGE = "ultralytics_thop"
SRC_URI[sha256sum] = "49ee1f2c37d92e2e03b407c610e7184dc3dea68aa3d9127d2694ca1ea4120889"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-pytorch \
"

RPROVIDES:${PN} = "python3-pytorch-opcounter"

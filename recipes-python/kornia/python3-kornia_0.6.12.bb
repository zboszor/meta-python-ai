SUMMARY = "Open Source Differentiable Computer Vision Library for PyTorch"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e23fadd6ceef8c618fc1c65191d846fa"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "e30bd3d830226f7a159dff1f7757c6200e8f27d1333f06e9d2f98bdb33ce18d3"

DEPENDS += "python3-pytorch-native"

RDEPENDS:${PN} += " \
	python3-pytorch \
"

PE = "1"

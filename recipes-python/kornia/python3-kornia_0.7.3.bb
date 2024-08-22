SUMMARY = "Open Source Differentiable Computer Vision Library for PyTorch"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e23fadd6ceef8c618fc1c65191d846fa"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "0eb861ea5d7e6c3891ae699a8b7103a5783af0a7c41888ca482420dd3d055306"

DEPENDS += "python3-pytorch-native"

RDEPENDS:${PN} += " \
	python3-pytorch \
	python3-kornia-rs \
"

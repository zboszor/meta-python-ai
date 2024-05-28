SUMMARY = "Open Source Differentiable Computer Vision Library for PyTorch"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e23fadd6ceef8c618fc1c65191d846fa"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "f834ccd51188d071ed286a6727471c94344ea2a718903cc6f0e56a92f9c66ac5"

DEPENDS += "python3-pytorch-native"

RDEPENDS:${PN} += " \
	python3-pytorch \
	python3-kornia-rs \
"

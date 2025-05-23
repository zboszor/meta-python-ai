SUMMARY = "Open Source Differentiable Computer Vision Library for PyTorch"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e23fadd6ceef8c618fc1c65191d846fa"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "9ce5a54a11df661794934a293f89f8b8d49e83dd09b0b9419f6082ab07afe433"

DEPENDS += "python3-pytorch-native"

RDEPENDS:${PN} += " \
	python3-pytorch \
	python3-kornia-rs \
"

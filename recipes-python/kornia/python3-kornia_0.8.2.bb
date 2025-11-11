SUMMARY = "Open Source Differentiable Computer Vision Library for PyTorch"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e23fadd6ceef8c618fc1c65191d846fa"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "5411b2ce0dd909d1608016308cd68faeef90f88c47f47e8ecd40553fd4d8b937"

DEPENDS += "python3-pytorch-native"

RDEPENDS:${PN} += " \
	python3-pytorch \
	python3-kornia-rs \
"

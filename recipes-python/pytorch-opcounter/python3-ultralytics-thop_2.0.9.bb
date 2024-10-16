SUMMARY = "Ultralytics THOP package for fast computation of PyTorch model FLOPs and parameters."
LICENSE = "AGPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4ae09d45eac4aa08d013b5f2e01c67f6"

DEPENDS = "python3-numpy-native"

inherit pypi python_setuptools_build_meta

PYPI_PACKAGE = "ultralytics_thop"
SRC_URI[sha256sum] = "fd53a15c105e789d9243411fbf6efb430e4c2c42d1606d5edcd21805cc9ac78b"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-pytorch \
"

RPROVIDES:${PN} = "python3-pytorch-opcounter"

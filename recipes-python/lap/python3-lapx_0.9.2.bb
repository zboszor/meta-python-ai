SUMMARY = "Linear Assignment Problem solver (LAPJV/LAPMOD)."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2afed7d436ef861a2252aca17b5f719b"

DEPENDS = " \
	python3-numpy-native python3-pybind11-native \
	python3-numpy python3-pybind11 \
"

PROVIDES = "python3-lap"

inherit pypi python_setuptools_build_meta cython

SRC_URI[sha256sum] = "7ebe8443e437c60c42ff3020865b75dd2e3a2f44b06ac178933a31317b608d1b"

RDEPENDS:${PN} = "python3-numpy python3-pybind11"
RPROVIDES:${PN} = "python3-lap"

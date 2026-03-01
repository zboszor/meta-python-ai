SUMMARY = "Linear Assignment Problem solver (LAPJV/LAPMOD)."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2afed7d436ef861a2252aca17b5f719b"

DEPENDS = " \
	python3-numpy-native python3-pybind11-native \
	python3-numpy python3-pybind11 \
"

PROVIDES = "python3-lap"

inherit pypi python_setuptools_build_meta cython

SRC_URI[sha256sum] = "234c6b1cb211482fa5b99d0f321bd9e391bd843e76c6e7bf8ed3ec754a2f99a1"

RDEPENDS:${PN} = "python3-numpy python3-pybind11"
RPROVIDES:${PN} = "python3-lap"

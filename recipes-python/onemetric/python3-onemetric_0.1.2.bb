SUMMARY = "Metrics Library to Evaluate Machine Learning Algorithms in Python"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

PYPI_PACKAGE = "onemetric"

inherit pypi setuptools3
SRC_URI[sha256sum] = "1f50d65d1722ebd9ee55c4580fb9dc8e35400529e3986afb6a39560c75a974e5"

RDEPENDS:${PN} = " \
	python3-pillow \
	python3-numpy \
	python3-seaborn \
	python3-matplotlib \
	python3-dataclasses-json \
"

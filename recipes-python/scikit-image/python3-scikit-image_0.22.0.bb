SUMMARY = "Image processing in Python"
LICENSE = "BSD-2-Clause & BSD-3-Clause & MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a29b37cfeca8846afded2708427fc004"

DEPENDS = " \
	python3-numpy-native python3-cython-native \
	python3-pythran-native python3-beniget-native \
	python3-ply-native python3-packaging-native \
	python3-ninja-native meson-native \
	python3-lazy-loader-native \
"

PYPI_PACKAGE = "scikit_image"

inherit pypi python_mesonpy pkgconfig

SRC_URI += " \
	file://0001-Use-cython3-executable.patch \
	file://0002-Use-numpy-version-greater-or-equal-to-the-pinned-ver.patch \
"

SRC_URI[sha256sum] = "018d734df1d2da2719087d15f679d19285fce97cd37695103deadfaef2873236"

do_configure:prepend () {
	find ${S} -name "*.py" -exec sed -i 's:^#!/usr/bin/env python$:#!/usr/bin/env python3:' {} \;
}

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-scipy \
	python3-networkx \
	python3-pillow \
	python3-imageio \
	python3-tifffile \
	python3-pywavelets \
	python3-imread \
	python3-lazy-loader \
"

# pooch

SUMMARY = "Manipulation and analysis of geometric objects"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=771eb47113291428a083f6bf398fa3cb"

DEPENDS = "python3-numpy-native python3-numpy geos"

#PR = "r1"

PYPI_PACKAGE = "shapely"

inherit pypi python_setuptools_build_meta cython
SRC_URI[sha256sum] = "2cbe90e86fa8fc3ca8af6ffb00a77b246b918c7cf28677b7c21489b678f6b02e"

export GEOS_INCLUDE_PATH = "${STAGING_INCDIR}"
export GEOS_LIBRARY_PATH = "${STAGING_LIBDIR}"

do_install:prepend () {
	sed -i \
		-e 's:${RECIPE_SYSROOT_NATIVE}::g' \
		-e 's:${RECIPE_SYSROOT}::g' \
		${S}/shapely/_geometry_helpers.c \
		${S}/shapely/_geos.c
}

RDEPENDS:${PN} = " \
	python3-core \
	python3-six \
	python3-json \
	python3-numpy \
	python3-threading \
	python3-pyproj \
	geos \
"

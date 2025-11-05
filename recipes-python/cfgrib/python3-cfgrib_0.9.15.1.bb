SUMMARY = "Python interface to map GRIB files to the NetCDF Common Data Model following the CF Convention using ecCodes"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS += "python3-setuptools-scm-native"

PYPI_PACKAGE = "cfgrib"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "d959d8b97e55a63646fa86686b297905ff7f2918a91e3a11d6292dab09598e4d"

RDEPENDS:${PN} = " \
	python3-attrs \
	python3-click \
	python3-eccodes \
	python3-numpy \
	python3-xarray \
"

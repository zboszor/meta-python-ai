SUMMARY = "Python interface to map GRIB files to the NetCDF Common Data Model following the CF Convention using ecCodes"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

PYPI_PACKAGE = "cfgrib"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "d455034e19b9560a75d008ba9d09b2d4e65762adfb2e911f28b841f4b9c6b47f"

RDEPENDS:${PN} = " \
	python3-attrs \
	python3-click \
	python3-eccodes \
	python3-numpy \
	python3-xarray \
"

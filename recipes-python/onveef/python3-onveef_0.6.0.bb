SUMMARY = "A fast, zeep-free ONVIF client library for Python - IP cameras, NVRs and VMS (Profile S/T/G/M/A/C), sync and async."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7bcff2423cf795f32bc41badff8675e4"

PYPI_PACKAGE = "onveef"

inherit pypi python_hatchling
SRC_URI[sha256sum] = "d3110a4084b518a649a0bc29ab71ce5620f0f127e3a95cd52c52bb9b9a418ab9"

RDEPENDS:${PN} = " \
	python3-httpx \
	python3-defusedxml \
"

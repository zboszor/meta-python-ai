SUMMARY = "Blazingly fast DataFrame library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fc1b8a73cb6b324d8260f0771a4a0e71"

inherit pypi siteinfo python_setuptools_build_meta

SRC_URI[sha256sum] = "0309e2a4633e712513401964b4d95452f124ceabf7aec6db50affb9ced4a274e"

RDEPENDS:${PN} = " \
	python3-polars-runtime-${SITEINFO_BITS} \
	python3-numpy \
	python3-pandas \
	python3-pyarrow \
	python3-pydantic \
"

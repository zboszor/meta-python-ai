SUMMARY = "readme_renderer is a library for rendering readme descriptions for Warehouse"
DESCRIPTION = "readme_renderer is a library for rendering readme descriptions for Warehouse"
HOMEPAGE = "https://github.com/pypa/readme_renderer"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8cc789b082b3d97e1ccc5261f8594d3f"

PYPI_PACKAGE = "readme_renderer"

SRC_URI[sha256sum] = "8712034eabbfa6805cacf1402b4eeb2a73028f72d1166d6f5cb7f9c047c5d1e1"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} = " \
	python3-nh3 \
	python3-docutils \
	python3-pygments \
"

BBCLASSEXTEND = "native nativesdk"

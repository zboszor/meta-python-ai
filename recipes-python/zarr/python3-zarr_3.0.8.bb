SUMMARY = "An implementation of chunked, compressed, N-dimensional arrays for Python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=4d29e9d51e8c62a9e5137946b3cca700"

DEPENDS = "python3-hatch-vcs-native"

PYPI_PACKAGE = "zarr"

inherit pypi python_hatchling
SRC_URI[sha256sum] = "88505d095af899a88ae8ac4db02f4650ef0801d2ff6f65b6d1f0a45dcf760a6d"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-numcodecs \
	python3-typing-extensions \
	python3-donfig \
	python3-fsspec \
"

# For GPU acceleration
#RRECOMMENDS:${PN} = " \
#	python3-cupy \
#	python3-obstore \
#"

SUMMARY = "An implementation of chunked, compressed, N-dimensional arrays for Python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=0921bf3c51e57d8a137f697a84958341"

DEPENDS = "python3-hatch-vcs-native"

PYPI_PACKAGE = "zarr"

inherit pypi python_hatchling
SRC_URI[sha256sum] = "b68676576a6fc42683dfcc0daeb3c0e994f71e1680696990bde056bd3acf3542"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-numcodecs \
	python3-google-crc32c \
	python3-typing-extensions \
	python3-donfig \
	python3-msgspec \
	python3-fsspec \
	python3-obstore \
	python3-typer \
"

# Extras
#   python3-cast-value-rs
#   python3-universal-pathlib
# For GPU acceleration
#RRECOMMENDS:${PN} = " \
#	python3-cupy \
#"

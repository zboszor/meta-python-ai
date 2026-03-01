SUMMARY = "An implementation of chunked, compressed, N-dimensional arrays for Python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=0921bf3c51e57d8a137f697a84958341"

DEPENDS = "python3-hatch-vcs-native"

PYPI_PACKAGE = "zarr"

inherit pypi python_hatchling
SRC_URI[sha256sum] = "fbe0c79675a40c996de7ca08e80a1c0a20537bd4a9f43418b6d101395c0bba2b"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-numcodecs \
	python3-google-crc32c \
	python3-typing-extensions \
	python3-donfig \
	python3-fsspec \
	python3-obstore \
	python3-typer \
"

# For GPU acceleration
#RRECOMMENDS:${PN} = " \
#	python3-cupy \
#"

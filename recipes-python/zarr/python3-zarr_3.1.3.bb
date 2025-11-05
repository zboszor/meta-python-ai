SUMMARY = "An implementation of chunked, compressed, N-dimensional arrays for Python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=0921bf3c51e57d8a137f697a84958341"

DEPENDS = "python3-hatch-vcs-native"

PYPI_PACKAGE = "zarr"

inherit pypi python_hatchling
SRC_URI[sha256sum] = "01342f3e26a02ed5670db608a5576fbdb8d76acb5c280bd2d0082454b1ba6f79"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-numcodecs \
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

SUMMARY = "Linear Assignment Problem solver (LAPJV/LAPMOD)."
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=72aa38c6a1903242cdc6e73f3d676e2f"
DEPENDS = "python3-numpy-native python3-numpy"
PROVIDES = "python3-lapx"

inherit pypi python_setuptools_build_meta cython

SRC_URI[sha256sum] = "570b414ea7ae6c04bd49d0ec8cdac1dc5634737755784d44e37f9f668bab44fd"

SRC_URI += "file://lap-use-cython3.patch"

RDEPENDS:${PN} = "python3-numpy"
RPROVIDES:${PN} = "python3-lapx"

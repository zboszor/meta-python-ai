SUMMARY = "WS-Discovery implementation for python"
LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b52f2d57d10c4f7ee67a7eb9615d5d24"

PYPI_PACKAGE = "WSDiscovery"

inherit pypi setuptools3
SRC_URI[sha256sum] = "ab816deff2db101be59830317e19b78a95e9146b2b0a747953345ae68d1d8b58"

RDEPENDS:${PN} = " \
	python3-ifaddr \
	python3-click \
"

SUMMARY = "Falcon CORS middlware"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=23f9ad5cad3d8cc0336e2a5d8a87e1fa"

PYPI_PACKAGE = "falcors"

inherit pypi setuptools3
SRC_URI[sha256sum] = "c8047da8ef83381b48a4e19d494e3228c63cf5f123670e932b02e89c0353ea61"

RPROVIDES:${PN} += "falcon-cors python3-falcon-cors"

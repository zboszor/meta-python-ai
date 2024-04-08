SUMMARY = "The Falcon Web Framework"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=8227180126797a0148f94f483f3e1489"
DEPENDS = "python3-wheel-native python3-pip-native python3-pytest-runner-native python3-pyjwt python3-falcon"

PYPI_PACKAGE = "falcon-auth"

inherit pypi setuptools3_legacy

SRC_URI[sha256sum] = "21ee33daf8b615fb24392b6f80bc2287d02bd0a3c4a924180d2678d5cc55838d"

SRC_URI += "file://fixups.patch"

RDEPENDS:${PN} = "python3-pyjwt python3-falcon"

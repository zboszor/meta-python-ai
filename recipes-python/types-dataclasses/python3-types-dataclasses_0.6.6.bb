SUMMARY = "Typing stubs for dataclasses"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=6;endline=6;md5=ef4dc1e740f5c928f1608a4a9c7b578e"

PYPI_PACKAGE = "types-dataclasses"

inherit pypi setuptools3
SRC_URI[sha256sum] = "4b5a2fcf8e568d5a1974cd69010e320e1af8251177ec968de7b9bb49aa49f7b9"

BBCLASSEXTEND = "native nativesdk"

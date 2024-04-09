SUMMARY = "Meta-package that provides the oldest NumPy that supports a given Python version and platform."
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cd2fb5acb8ca578f466022cacf075418"

#PR = "r1"

PYPI_PACKAGE = "oldest-supported-numpy"

inherit pypi setuptools3
SRC_URI[sha256sum] = "71d89c31bb567814e47e2e268eb2e92b6f99f5ce76f4c3db30833624e9ef29e0"

BBCLASSEXTEND = "native nativesdk"

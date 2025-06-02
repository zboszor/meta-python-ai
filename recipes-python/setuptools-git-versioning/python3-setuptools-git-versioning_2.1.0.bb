SUMMARY = "Use git repo data for building a version number according PEP-440"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=92e79e3a844e66731724600f3ac9c0d8"

PYPI_PACKAGE = "setuptools_git_versioning"

inherit pypi setuptools3
SRC_URI[sha256sum] = "6aef5b8bb1cfb953b6b343d27cbfc561d96cf2a2ee23c2e0dd3591042a059921"

BBCLASSEXTEND = "native nativesdk"

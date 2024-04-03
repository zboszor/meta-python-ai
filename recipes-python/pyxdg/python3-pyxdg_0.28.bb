SUMMARY = "PyXDG is a python library to access freedesktop.org standards"
DESCRIPTION = "PyXDG contains implementations of freedesktop.org standards in python"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=f30a9716ef3762e3467a2f62bf790f0a"

inherit pypi setuptools3

PYPI_PACKAGE = "pyxdg"
PYPI_PACKAGE_EXT = "tar.gz"

UPSTREAM_CHECK_URI = "https://pypi.python.org/pypi/pyxdg/"
UPSTREAM_CHECK_REGEX = "/pyxdg/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[sha256sum] = "3267bb3074e934df202af2ee0868575484108581e6f3cb006af1da35395e88b4"

SUMMARY = "Linear Assignment Problem solver (LAPJV/LAPMOD)."
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=72abc5e2e38df441279b5f4a6a9cbdc8"
DEPENDS = "python3-cython-native python3-numpy-native python3-numpy"
PROVIDES = "python3-lap"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "13f14a4007dccbfbacf54a556a3bf8b031737bbd4edb989bbb4518d49cf74f86"

SRC_URI += "file://lapx-use-cython3.patch"

RDEPENDS:${PN} = "python3-numpy"
RPROVIDES:${PN} = "python3-lap"
RCONFLICTS:${PN} = "python3-lap"
RREPLACES:${PN} = "python3-lap"

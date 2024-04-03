SUMMARY = "lazy_loader"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=0ed504abd9c0cbada2733980c9c7501f"

DEPENDS = "python3-flit-core-native"

PYPI_PACKAGE = "lazy_loader"

inherit pypi python_setuptools_build_meta
SRC_URI[sha256sum] = "3b68898e34f5b2a29daaaac172c6555512d0f32074f147e2254e4a6d9d838f37"

BBCLASSEXTEND = "native nativesdk"

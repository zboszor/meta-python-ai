SUMMARY = "Functools like those found in stdlib"
DESCRIPTION = "Functools like those found in stdlib"
HOMEPAGE = "https://github.com/jaraco/jaraco.functools"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1aeae65f25a15b1e46d4381f2f094e0a"

DEPENDS = "python3-setuptools-scm-native python3-coherent-licensed-native"

PYPI_PACKAGE = "jaraco_functools"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "cfd13ad0dd2c47a3600b439ef72d8615d482cedcff1632930d6f28924d92f294"

RDEPENDS:${PN} = " \
	python3-more-itertools \
"

BBCLASSEXTEND = "native nativesdk"

SUMMARY = "Store and access your passwords safely."
DESCRIPTION = "Store and access your passwords safely."
HOMEPAGE = "https://github.com/jaraco/keyring"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1aeae65f25a15b1e46d4381f2f094e0a"

DEPENDS = "python3-setuptools-scm-native python3-coherent-licensed-native"

SRC_URI[sha256sum] = "fe01bd85eb3f8fb3dd0405defdeac9a5b4f6f0439edbb3149577f244a2e8245b"

inherit pypi python_setuptools_build_meta

BBCLASSEXTEND = "native nativesdk"

RDEPENDS:${PN} = " \
	python3-jaraco-classes \
	python3-jaraco-context \
	python3-jaraco-functools \
	python3-jeepney \
	python3-importlib-metadata \
	python3-secretstorage \
"

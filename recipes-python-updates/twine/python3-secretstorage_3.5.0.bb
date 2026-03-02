SUMMARY = "Python bindings to FreeDesktop.org Secret Service API"
DESCRIPTION = "Python bindings to FreeDesktop.org Secret Service API"
HOMEPAGE = "https://github.com/mitya57/secretstorage"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dd46c64a80a6af22b6fe362ccbc958c6"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "f04b8e4689cbce351744d5537bf6b1329c6fc68f91fa666f60a380edddcd11be"

RDEPENDS:${PN} = " \
	python3-cryptography \
	python3-jeepney \
"

BBCLASSEXTEND = "native nativesdk"

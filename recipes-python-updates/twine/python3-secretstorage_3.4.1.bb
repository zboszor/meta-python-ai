SUMMARY = "Python bindings to FreeDesktop.org Secret Service API"
DESCRIPTION = "Python bindings to FreeDesktop.org Secret Service API"
HOMEPAGE = "https://github.com/mitya57/secretstorage"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dd46c64a80a6af22b6fe362ccbc958c6"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "a799acf5be9fb93db609ebaa4ab6e8f1f3ed5ae640e0fa732bfea59e9c3b50e8"

RDEPENDS:${PN} = " \
	python3-cryptography \
	python3-jeepney \
"

BBCLASSEXTEND = "native nativesdk"

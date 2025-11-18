SUMMARY = "Validating URI References per RFC 3986"
DESCRIPTION = "Validating URI References per RFC 3986"
HOMEPAGE = "http://rfc3986.readthedocs.io"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=03731a0e7dbcb30cecdcec77cc93ec29"

SRC_URI[sha256sum] = "97aacf9dbd4bfd829baad6e6309fa6573aaf1be3f6fa735c8ab05e46cecb261c"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} = " \
	python3-idna \
"

BBCLASSEXTEND = "native nativesdk"

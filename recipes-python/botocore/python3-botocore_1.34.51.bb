SUMMARY = "The low-level, core functionality of boto 3."
HOMEPAGE = "https://github.com/boto/botocore"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2ee41112a44fe7014dce33e26468ba93"

SRC_URI[sha256sum] = "5086217442e67dd9de36ec7e87a0c663f76b7790d5fb6a12de565af95e87e319"

inherit pypi setuptools3

RDEPENDS:${PN} += "python3-jmespath python3-dateutil python3-logging"

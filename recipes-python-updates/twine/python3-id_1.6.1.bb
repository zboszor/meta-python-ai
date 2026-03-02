SUMMARY = "A tool for generating OIDC identities"
DESCRIPTION = "A tool for generating OIDC identities"
HOMEPAGE = "https://pypi.org/project/id/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI[sha256sum] = "d0732d624fb46fd4e7bc4e5152f00214450953b9e772c182c1c22964def1a069"

inherit pypi python_flit_core

BBCLASSEXTEND = "native nativesdk"

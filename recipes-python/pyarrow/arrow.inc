LICENSE = "Apache-2.0"
SRC_URI = "git://github.com/apache/arrow;protocol=https;branch=maint-23.0.x"

# Compilation fails if + is used in the package version because of incorrect path management
PV = "23.0.1"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=0badcc877b5f854c7ecea97159bf6d73"
SRCREV = "82a374e5f3de5b744f26591e6cd96de6349c76d9"

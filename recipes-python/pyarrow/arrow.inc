LICENSE = "Apache-2.0"
SRC_URI = "git://github.com/apache/arrow;protocol=https;nobranch=1"

# Compilation fails if + is used in the package version because of incorrect path management
PV = "22.0.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=457249e5c7a629554dd41d2ecbc53725"
SRCREV = "5aeb5f217f1ba39c428c9b481f393bd37097f69e"

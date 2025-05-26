LICENSE = "Apache-2.0"
SRC_URI = "git://github.com/apache/arrow;protocol=https;nobranch=1"

# Compilation fails if + is used in the package version because of incorrect path management
PV = "20.0.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=021a60277f9c3728811219d900377968"
SRCREV = "3ad0370a04ccdae638755b94c3c31c8760a11193"

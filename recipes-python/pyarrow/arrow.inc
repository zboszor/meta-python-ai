LICENSE = "Apache-2.0"
SRC_URI = "git://github.com/apache/arrow;protocol=https;nobranch=1"

# Compilation fails if + is used in the package version because of incorrect path management
PV = "17.0.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=100c3e6324688e340080d7fd971b8c5e"
SRCREV = "6a2e19a852b367c72d7b12da4d104456491ed8b7"

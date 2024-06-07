LICENSE = "Apache-2.0"
SRC_URI = "git://github.com/apache/arrow;protocol=https;nobranch=1"

# Compilation fails if + is used in the package version because of incorrect path management
PV = "16.1.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=100c3e6324688e340080d7fd971b8c5e"
SRCREV = "7dd1d34074af176d9e861a360e135ae57b21cf96"

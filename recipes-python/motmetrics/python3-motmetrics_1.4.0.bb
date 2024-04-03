SUMMARY = "Metrics for multiple object tracker benchmarking."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=594b7ae7d569313ad10b1a254f3fff34"

inherit setuptools3

SRC_URI = "git://github.com/cheind/py-motmetrics.git;protocol=https;branch=master"

SRCREV = "3dc05b475766509e04b2fa640b5ed38ee09e0d94"

S = "${WORKDIR}/git"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-pandas \
	python3-scipy \
	python3-xmltodict \
"

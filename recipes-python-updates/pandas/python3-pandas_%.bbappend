PV = "3.0.1"
SRC_URI[sha256sum] = "4186a699674af418f655dbd420ed87f50d56b4cd6603784279d9eef6627823c8"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e98642e1210ade884e5254ab18d55b7d"

SRC_URI:remove = " \
	file://0001-pyproject.toml-don-t-pin-dependency-versions.patch \
	file://0001-fix-reproducibility-issue.patch \
"

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

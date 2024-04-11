FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

SRC_URI += " \
	file://0001-Conceal-imp-warnings-in-Python3.patch \
	file://0002-Fix-all-DeprecationWarning-invalid-escape-sequence.patch \
"

SUMMARY = "Blosc data compressor"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=baedf3dcd9937dd23bd308286702c89c"

DEPENDS = "python3-numpy-native blosc"

inherit setuptools3 python3native

SRC_URI = " \
	git://github.com/Blosc/python-blosc.git;protocol=https;branch=main \
	file://setup.py \
"

SRCREV = "1b0334bcc3a3686d473ebb498ba9b47c7dc02b42"

do_configure:prepend () {
	rm -f ${S}/setup.py
	cp ${UNPACKDIR}/setup.py ${S}/setup.py
}

export BLOSC_DIR = "${STAGING_EXECPREFIXDIR}"

RDEPENDS:${PN} = "python3-numpy"

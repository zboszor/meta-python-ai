SUMMARY = "Generate Random Names for anything"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=23f9ad5cad3d8cc0336e2a5d8a87e1fa"

PR = "r1"

PYPI_PACKAGE = "namegenerator"

inherit pypi setuptools3
SRC_URI[sha256sum] = "144759c62d771e5b589514a0aa332d0b967818c0a24b7824e48a905357c58bfa"

addtask do_fixperms after do_unpack before do_patch

do_fixperms () {
	find ${S} -type d -exec chmod 755 {} \;
	find ${S} -type f -exec chmod 644 {} \;
}

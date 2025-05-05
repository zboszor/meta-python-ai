SUMMARY = "Compressed numerical arrays that support high-speed random access"

inherit cmake

require zfp.inc

SRC_URI += "file://0001-Don-t-set-RPATH-in-binaries.patch"

PACKAGES =+ "${PN}-bin"

FILES:${PN}-bin = "${bindir}/zfp"

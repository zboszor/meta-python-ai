SUMMARY = "A tool to count the FLOPs of PyTorch model."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bbd5f20a9d36b903b4fd2bb8e7fd3a4b"

DEPENDS = "python3-cython-native python3-numpy-native"

SRC_URI = " \
	git://github.com/Lyken17/pytorch-OpCounter.git;protocol=https;branch=master \
	file://fix-version.patch \
"

SRCREV = "43c064afb71383501e41eaef9e8c8407265cf77f"

S = "${WORKDIR}/git"

inherit setuptools3_legacy

RDEPENDS:${PN} = "python3-pytorch"

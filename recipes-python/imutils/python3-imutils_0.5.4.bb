SUMMARY = "A series of convenience functions to make basic image processing \
functions such as translation, rotation, resizing, skeletonization, \
displaying Matplotlib images, sorting contours, detecting edges, and \
much more easier with OpenCV and both Python 2.7 and Python 3."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=1360854e0617129c509b839f6a51874f"

inherit setuptools3_legacy

SRC_URI = "git://github.com/PyImageSearch/imutils.git;protocol=https;branch=master"

SRCREV = "9f740a53bcc2ed7eba2558afed8b4c17fd8a1d4c"

S = "${WORKDIR}/git"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-scipy \
	python3-matplotlib \
	python3-opencv \
"

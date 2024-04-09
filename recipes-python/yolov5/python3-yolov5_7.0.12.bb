SUMMARY = "Packaged version of the Yolov5 object detector"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://yolov5/LICENSE;md5=eb1e647870add0502f8f010b19de32af"

DEPENDS = "python3-numpy-native"

inherit setuptools3

SRCREV = "89c3040e734e8a0185fb49c667184600bb827f25"

SRC_URI = " \
	git://github.com/ultralytics/yolov5.git;protocol=https;branch=master;subdir=${S};destsuffix=yolov5 \
	file://setup.py;subdir=${S} \
	file://MANIFEST.in;subdir=${S} \
	file://__init__.py;subdir=${S}/yolov5 \
"

do_configure:prepend () {
	if [ -f ${S}/yolov5/requirements.txt ]; then
		mv ${S}/yolov5/*.cff ${S}
		mv ${S}/yolov5/*.md ${S}
		cp ${S}/yolov5/LICENSE ${S}
		mv ${S}/yolov5/requirements.txt ${S}
		mv ${S}/yolov5/setup.cfg ${S}
		sed -i 's:@VERSION@:${PV}:' ${S}/yolov5/__init__.py
	fi
}

RDEPENDS:${PN} = " \
	bash \
	python3-matplotlib \
	python3-numpy \
	python3-opencv \
	python3-pillow \
	python3-psutil \
	python3-pyyaml \
	python3-requests \
	python3-scipy \
	python3-pytorch-opcounter \
	python3-pytorch \
	python3-torchvision \
	python3-tqdm \
	python3-ultralytics \
	python3-pandas \
	python3-seaborn \
	python3-ipython \
"

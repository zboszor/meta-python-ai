SUMMARY = "Packaged version of the Yolov5 object detector"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=97ff9683aa36f333c7d2295d6520090f"

DEPENDS = "python3-numpy-native"

inherit setuptools3

SRC_URI = "git://github.com/fcakyon/yolov5-pip.git;protocol=https;branch=main"
SRCREV = "40a188792bca82b8285549edb2c318b9d73bcd47"


RDEPENDS:${PN} = " \
	bash \
	python3-git \
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
	python3-fire \
	python3-boto3 \
"

# Unsatisfied optional deps:
# tensorboard>=2.4.1
# sahi>=0.11.10
# huggingface-hub<0.25.0,>=0.12.0
# roboflow>=0.2.29

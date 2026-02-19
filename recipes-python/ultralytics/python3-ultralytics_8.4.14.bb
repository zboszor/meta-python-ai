SUMMARY = "Ultralytics YOLOv8 for SOTA object detection, multi-object tracking, instance segmentation, pose estimation and image classification."
LICENSE = "AGPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=eb1e647870add0502f8f010b19de32af"

DEPENDS = "python3-numpy-native"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "360dff28ecb6cc7bf561aadf5bfe208c3900380bf1d4b2b190cb8db60e7b7626"

RDEPENDS:${PN} = " \
	bash \
	python3-numpy \
	python3-matplotlib \
	python3-opencv \
	python3-pillow \
	python3-pyyaml \
	python3-requests \
	python3-scipy \
	python3-pytorch \
	python3-torchvision \
	python3-psutil \
	python3-polars \
	python3-ultralytics-thop \
"

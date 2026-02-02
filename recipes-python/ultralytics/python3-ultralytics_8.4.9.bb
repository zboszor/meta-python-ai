SUMMARY = "Ultralytics YOLOv8 for SOTA object detection, multi-object tracking, instance segmentation, pose estimation and image classification."
LICENSE = "AGPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=eb1e647870add0502f8f010b19de32af"

DEPENDS = "python3-numpy-native"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "7fedde080f415acbe42afb1db569a887b829e79e0ba5f104a2be2f75bb2e8833"

SRC_URI += "file://0001-Fix-autobackend.py-when-using-OpenVINO-23505.patch"

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

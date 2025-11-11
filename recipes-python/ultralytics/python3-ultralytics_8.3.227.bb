SUMMARY = "Ultralytics YOLOv8 for SOTA object detection, multi-object tracking, instance segmentation, pose estimation and image classification."
LICENSE = "AGPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=eb1e647870add0502f8f010b19de32af"

DEPENDS = "python3-numpy-native"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "26a0c524512407cf88fda68ab19e37c7c2dc850bcf5c7f25083a66a16066c235"

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
	python3-tqdm \
	python3-psutil \
	python3-py-cpuinfo \
	python3-pandas \
	python3-ultralytics-thop \
"

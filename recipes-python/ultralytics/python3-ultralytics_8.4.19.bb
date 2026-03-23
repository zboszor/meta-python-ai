SUMMARY = "Ultralytics YOLOv8 for SOTA object detection, multi-object tracking, instance segmentation, pose estimation and image classification."
LICENSE = "AGPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=eb1e647870add0502f8f010b19de32af"

DEPENDS = "python3-numpy-native"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "e4bb5abf58e54fcb2c36fe37a6b12ab96b73de766692f24e53b69f1fa8987eb3"
SRC_URI += "file://23874.patch"

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

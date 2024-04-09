SUMMARY = "ByteTrack: Multi-Object Tracking by Associating Every Detection Box"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3d0d8afca6872e02b102c0776327a07"

DEPENDS = " \
	python3-pytorch-native python3-numpy-native \
	python3-sympy-native python3-pybind11 \
"

PR = "r1"

SRC_URI = " \
	git://github.com/ifzhang/ByteTrack.git;protocol=https;branch=main \
	file://0001-Replace-np.float-with-float.patch \
	file://0002-Replace-np.int-with-int.patch \
	file://0003-Replace-np.bool-with-bool.patch \
"

SRCREV = "d1bf0191adff59bc8fcfeaa0b33d3d1642552a99"

S = "${WORKDIR}/git"

inherit setuptools3
SRC_URI[sha256sum] = "6e796f5d05c9e1e1ccbbf9de5785d5db445784c71350799ca6473a14414fdc00"

RDEPENDS:${PN} = " \
	python3-numpy \
	python3-pybind11 \
	python3-pytorch \
	python3-opencv \
	python3-loguru \
	python3-scipy \
	python3-scikit-learn \
	python3-scikit-image \
	python3-tqdm \
	python3-torchvision \
	python3-pillow \
	python3-tabulate \
	python3-motmetrics \
	python3-h5py \
	python3-pandas \
	python3-pytorch-opcounter \
	python3-lap \
"

# ninja tensorboard filterpy

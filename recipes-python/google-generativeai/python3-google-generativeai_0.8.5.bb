SUMMARY = "Google Generative AI High level API client library and tools."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS = "python3-numpy-native"

inherit python_setuptools_build_meta

SRCREV = "f5ac4edfb8ba67384e767b257079fb3038ac1ab2"


SRC_URI = " \
	git://github.com/google-gemini/generative-ai-python.git;protocol=https;branch=main \
"

RDEPENDS:${PN} = " \
	python3-google-ai-generativelanguage \
	python3-google-api-core \
	python3-google-api-python-client \
	python3-google-auth \
	python3-protobuf \
	python3-pydantic \
	python3-tqdm \
	python3-typing-extensions \
"

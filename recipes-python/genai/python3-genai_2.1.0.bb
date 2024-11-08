SUMMARY = "Generative AI for IPython (enhance your code cells)"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ab8d5767e4d6a0e1803f27e3f98e90e4"

PYPI_PACKAGE = "genai"

inherit pypi python_poetry_core
SRC_URI[sha256sum] = "71abe894703d2a097148fd08152bedd3f320598536317dc0cd9bee69e9f87314"

RDEPENDS:${PN} = " \
	python3-openai \
	python3-ipython \
	python3-tabulate \
	python3-tiktoken \
"

BBCLASSEXTEND = "native nativesdk"

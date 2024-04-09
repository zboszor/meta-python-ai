SUMMARY = "Style preserving TOML library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=31aac0dbc1babd278d5386dadb7f8e82"

PYPI_PACKAGE = "tomlkit"

inherit pypi python_poetry_core
SRC_URI[sha256sum] = "7ca1cfc12232806517a8515047ba66a19369e71edf2439d0f5824f91032b6cc3"

BBCLASSEXTEND = "native nativesdk"

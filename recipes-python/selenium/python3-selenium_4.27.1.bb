SUMMARY = "Official Python bindings for Selenium WebDriver"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fc85982553603542b7c1fc0ffa7e4fc7"
DEPENDS = "python3-setuptools-rust-native"

PR = "r1"

PYPI_PACKAGE = "selenium"

S = "${WORKDIR}/${PYPI_PACKAGE}-${PV}"

inherit pypi cargo-update-recipe-crates python_setuptools3_rust
SRC_URI[sha256sum] = "5296c425a75ff1b44d0d5199042b36a6d1ef76c04fb775b97b40be739a9caae2"

SRC_URI += "file://disable-abort-panic.patch"

require ${BPN}-crates.inc

RDEPENDS:${PN} = " \
	python3-urllib3 \
	python3-trio \
	python3-trio-websocket \
	python3-certifi \
	python3-typing-extensions \
	python3-websocket-client \
"

PACKAGECONFIG ??= ""

# The corresponding package recipes are in meta-browser/meta-chromium.
# The user must select the proper browser build, which conflict.
# Due to DISTRO_FEATURES may contain both x11 and wayland,
# plus xwayland also exists, it can't be automatically determined
# which browser build is to be used.
PACKAGECONFIG[chromiumx11] = ",,,chromium-x11-chromedriver"
PACKAGECONFIG[chromiumwayland] = ",,,chromium-ozone-wayland-chromedriver"

# TODO: Find out whether meta-browser/meta-firefox packages geckodriver.

do_install:append () {
	# Add missing files needed for correct operation
	cp -r ${S}/selenium/webdriver/common/fedcm ${D}${PYTHON_SITEPACKAGES_DIR}/${PYPI_PACKAGE}/webdriver/common/
	cp ${S}/selenium/webdriver/common/mutation-listener.js ${D}${PYTHON_SITEPACKAGES_DIR}/${PYPI_PACKAGE}/webdriver/common/
	cp ${S}/selenium/webdriver/remote/*.js ${D}${PYTHON_SITEPACKAGES_DIR}/${PYPI_PACKAGE}/webdriver/remote/
}

INSANE_SKIP:${PN} = "already-stripped"

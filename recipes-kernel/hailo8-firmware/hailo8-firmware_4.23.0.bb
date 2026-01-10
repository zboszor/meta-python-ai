HOMEPAGE = "https://github.com/hailo-ai/hailort-drivers"	
DESCRIPTION = "Firmware for hailo8 kernel driver"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

inherit allarch

SRC_URI = "https://hailo-hailort.s3.eu-west-2.amazonaws.com/Hailo8/${PV}/FW/hailo8_fw.${PV}.bin"

SRC_URI[sha256sum] = "1ba9528972091ec17bebc0dc7ea2e6f4449efe70664890f6387ccbc7b60626ee"

S = "${UNPACKDIR}"

do_install () {
	install -d -m0755 ${D}${nonarch_libdir}/firmware/hailo
	install -m0644 ${UNPACKDIR}/hailo8_fw.${PV}.bin ${D}${nonarch_libdir}/firmware/hailo/hailo8_fw.bin
}

FILES:${PN} = "${nonarch_libdir}/firmware/hailo/hailo8_fw.bin"

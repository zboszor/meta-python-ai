FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-remove-the-full-path-from-the-generated-comment.patch"

PACKAGECONFIG:append:class-target = " \
        ${@bb.utils.contains('DISTRO_FEATURES', 'vulkan', 'libplacebo', '', d)} \
"

PACKAGECONFIG[libplacebo] = "--enable-libplacebo,--disable-libplacebo,libplacebo vulkan-headers"

do_configure:append () {
        # Fix race conditions during the build
        mkdir -p ${B}/libavfilter/vulkan
        mkdir -p ${B}/fftools/resources
}

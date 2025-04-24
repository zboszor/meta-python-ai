PACKAGECONFIG:append:class-target = " \
	${@bb.utils.contains('DISTRO_FEATURES', 'vulkan', 'libplacebo shaderc', '', d)} \
"

PACKAGECONFIG[libplacebo] = "--enable-libplacebo,--disable-libplacebo,libplacebo vulkan-headers"
PACKAGECONFIG[shaderc] = "--enable-libshaderc,--disable-libshaderc,shaderc"

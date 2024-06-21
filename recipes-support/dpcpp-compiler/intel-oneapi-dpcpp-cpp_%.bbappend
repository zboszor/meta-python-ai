SYSROOT_DIRS += "/opt"
SYSROOT_DIRS_NATIVE += "${RECIPE_SYSROOT_NATIVE}/opt"

do_install:append () {
	MAINVER=$(echo ${PV} | cut -d '.' -f 1-2)
	ln -s $MAINVER ${D}${RECIPE_SYSROOT_NATIVE}/opt/intel/oneapi/compiler/latest
}

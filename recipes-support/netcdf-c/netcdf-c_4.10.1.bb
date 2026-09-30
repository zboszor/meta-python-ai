DESCRIPTION = "Unidata NetCDF"
HOMEPAGE = "https://github.com/Unidata/netcdf-c"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=cbb22cd5ded182bbd11d88ea19479b58"

DEPENDS = "hdf5 curl bzip2 libzip zlib zstd libxml2"

inherit pkgconfig cmake

SRC_URI = "git://github.com/Unidata/netcdf-c.git;protocol=https;branch=v${PV}-prep.wif"

SRCREV = "ad3d53827ab4c70f65a63eae7aad660da58e6cb5"

do_install:append () {
	rm -f ${D}${libdir}/libnetcdf.settings
	sed -i \
		-e 's:ccompiler=.*/\(.*\)$:ccompiler=\1:' \
		${D}${libdir}/pkgconfig/netcdf.pc
	sed -i \
		-e 's:${STAGING_DIR_NATIVE}::g' \
		-e 's:${STAGING_DIR_TARGET}::g' \
		-e 's:${WORKDIR}::g' \
		-e 's:==:=:g' \
		${D}${libdir}/cmake/netCDF/netCDFConfig.cmake
}

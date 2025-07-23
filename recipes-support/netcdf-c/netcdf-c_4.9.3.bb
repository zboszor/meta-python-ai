DESCRIPTION = "Unidata NetCDF"
HOMEPAGE = "https://github.com/Unidata/netcdf-c"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=17c864f08a4445fe9c41226785e9ed10"

DEPENDS = "hdf5 curl"

inherit cmake

SRC_URI = "git://github.com/Unidata/netcdf-c.git;protocol=https;branch=v${PV}-prep.wif"

SRCREV = "3a6b1debf1557f07b606ce3653e44f0d711203be"


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

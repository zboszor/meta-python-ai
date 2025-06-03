SUMMARY = "A common runtime for AWS Python projects (C/C++ parts)"

require awscrt.inc

DEPENDS = "openssl"

inherit cmake

OECMAKE_SOURCEPATH = "${S}/crt"

EXTRA_OECMAKE = " \
	-DBUILD_SHARED_LIBS=ON \
	-DUSE_OPENSSL=ON \
"

FILES:${PN}-dev += "${libdir}/s2n/cmake"

# libs2n.so.1.0.0 lacks GNU hash for some reason. Nothing else.
INSANE_SKIP:${PN} = "ldflags"

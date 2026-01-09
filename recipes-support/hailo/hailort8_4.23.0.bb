DESCRIPTION = "An open source light-weight and high performance inference framework for Hailo devices"
HOMEPAGE = "https://github.com/hailo-ai/hailort/tree/hailo8"
LICENSE = "MIT & LGPL-2.1-or-later"

DEPENDS = " \
	protobuf-native protobuf spdlog xxhash cli11 \
	libeigen nlohmann-json dotwriter readerwriterqueue \
"

inherit cmake pkgconfig systemd

LIC_FILES_CHKSUM = " \
	file://hailort/LICENSE;md5=ed57bbf10be0c74ecf2c80710208b2b3 \
	file://hailort/libhailort/bindings/gstreamer/LICENSE;md5=4b54a1fd55a448865a0b32d41598759d \
"

SRC_URI = " \
	git://github.com/hailo-ai/hailort.git;protocol=https;branch=hailo8 \
	https://hailo-hailort.s3.eu-west-2.amazonaws.com/Hailo8/${PV}/HEFS/shortcut_net.hef;name=shortcut_net \
	https://hailo-hailort.s3.eu-west-2.amazonaws.com/Hailo8/${PV}/HEFS/shortcut_net_nv12.hef;name=shortcut_net_nv12 \
	https://hailo-hailort.s3.eu-west-2.amazonaws.com/Hailo8/${PV}/HEFS/multi_network_shortcut_net.hef;name=multi_network_shortcut_net \
	https://hailo-hailort.s3.eu-west-2.amazonaws.com/Hailo8/${PV}/HEFS/resnet_v1_18.hef;name=resnet_v1_18 \
	file://0001-Use-a-pre-built-protobuf-dependency.patch \
	file://0002-Use-a-pre-built-spdlog-dependency.patch \
	file://0003-Use-a-pre-built-cli11-dependency.patch \
	file://0004-Use-a-pre-built-xxhash-dependency.patch \
	file://0005-Use-a-pre-built-eigen-dependency.patch \
	file://0006-Use-a-pre-built-nlohmann-json-dependency.patch \
	file://0007-Use-a-pre-built-dotwriter-dependency.patch \
	file://0008-Use-a-pre-built-readerwriterqueue-dependency.patch \
	file://0009-Build-parts-of-hailort-with-C-17.patch \
	file://0010-Link-hailortcli-with-libabsl-parts.patch \
	file://0011-Use-generic-gstreamer-install-directory.patch \
	file://0012-Rename-gst-plugin-to-hailo8.patch \
	file://0013-Use-a-pre-built-grpc-dependency.patch \
	file://0014-Modify-the-pid-file-name.patch \
"

SRCREV = "08f088d3b443c7846af067269ce998c6d5d91449"

SRC_URI[shortcut_net.sha256sum] = "f45d88f827770ef89f008ca74555a09985ed5f63e39f6a3e73f983a2cfa738bd"
SRC_URI[shortcut_net_nv12.sha256sum] = "25d389d75e9e7d70ba106d58655cc9110d1f988a32532f3a8d92372156b677f1"
SRC_URI[multi_network_shortcut_net.sha256sum] = "e02cd75bad6f034259b6aa67103db42f9748ceb02e948d08727bfea5db6fc346"
SRC_URI[resnet_v1_18.sha256sum] = "20256ea3bee60d9ef22c19c6feb83600a76147980428439f77a6c6840ac1f027"

EXTRA_OECMAKE = "-DCMAKE_BUILD_TYPE=RelWithDebInfo"

PACKAGECONFIG ?= "gstreamer examples service"

PACKAGECONFIG[gstreamer] = "-DHAILO_BUILD_GSTREAMER=ON,-DHAILO_BUILD_GSTREAMER=OFF,glib-2.0 gstreamer1.0 gstreamer1.0-plugins-base"
PACKAGECONFIG[examples] = "-DHAILO_BUILD_EXAMPLES=ON,-DHAILO_BUILD_EXAMPLES=ON"
PACKAGECONFIG[service] = "-DHAILO_BUILD_SERVICE=ON -DHAILO_GRPC_CPP_PLUGIN_EXECUTABLE=${STAGING_BINDIR_NATIVE}/grpc_cpp_plugin,-DHAILO_BUILD_SERVICE=OFF,grpc-native grpc"

do_install:append () {
	install -d ${D}${libdir}
	install ${B}/hailort/libhailort/src/libhailort.so.${PV} ${D}${libdir}
	ln -s libhailort.so.${PV} ${D}${libdir}/libhailort.so

	install -d ${D}${bindir}
	install -m0755 ${B}/hailort/hailortcli/hailortcli ${D}${bindir}/hailort8cli

	if [ "${@bb.utils.contains('PACKAGECONFIG', 'examples', '1', '0', d)}" = "1" ]; then
		install -d ${D}${datadir}/${PN}/examples/hefs
		install -m0644 ${UNPACKDIR}/{shortcut_net,shortcut_net_nv12,multi_network_shortcut_net}.hef ${D}${datadir}/${PN}/examples/hefs
		install -d ${D}${datadir}/${PN}/tutorials/hefs
		install -m0644 ${UNPACKDIR}/{resnet_v1_18,shortcut_net}.hef ${D}${datadir}/${PN}/tutorials/hefs

		install -d ${D}${bindir}/${PN}/examples/{c,cpp}
		for example_type in c cpp ; do
			find ${B}/hailort/libhailort/examples/$example_type -maxdepth 1 -type d | while read dir ; do
				example_name=$(basename $dir)
				if [ "$example_name" != "CMakeFiles" ]; then
					if [ -f "$dir/${example_type}_${example_name}" ]; then
						install -m755 "$dir/${example_type}_${example_name}" ${D}${bindir}/${PN}/examples/$example_type
					fi
				fi
			done
		done
	fi

	if [ "${@bb.utils.contains('PACKAGECONFIG', 'service', '1', '0', d)}" = "1" ]; then
		install -m0755 ${B}/hailort/hailort_service/hailort_service ${D}${bindir}/hailort8_service

		install -d ${D}${systemd_system_unitdir}
		install -m0644 ${S}/hailort/hailort_service/hailort.service ${D}${systemd_system_unitdir}/hailort8.service
		sed -i \
			-e 's:^ExecStart=.*$:ExecStart=${bindir}/hailort8_service:' \
			-e 's:^EnvironmentFile=.*$:EnvironmentFile=${sysconfdir}/default/hailort8_service:' \
			-e 's:^PIDFile=.*$:PIDFile=/run/hailo/hailort8_service.pid:' \
			${D}${systemd_system_unitdir}/hailort8.service

		install -d ${D}${sysconfdir}/default
		install -m0644 ${S}/hailort/hailort_service/hailort_service ${D}${sysconfdir}/default/hailort8_service
	fi
}

CXXFLAGS += "-fpermissive"

PACKAGES =+ "${PN}-gstreamer ${PN}-examples ${PN}-cli ${PN}-systemd"

DEBIAN_NOAUTONAME:${PN}-gstreamer = "1"
DEBIAN_NOAUTONAME:${PN}-examples = "1"
DEBIAN_NOAUTONAME:${PN}-cli = "1"
DEBIAN_NOAUTONAME:${PN}-systemd = "1"

SYSTEMD_PACKAGES = "${PN}-systemd"
SYSTEMD_SERVICE:${PN}-systemd = "hailort8.service"

FILES:${PN}-gstreamer = "${libdir}/gstreamer-1.0"
FILES:${PN}-examples = "${bindir}/${PN}/examples ${datadir}/${PN}/examples ${datadir}/${PN}/tutorials"
FILES:${PN}-cli = "${bindir}/hailort8cli"
FILES:${PN}-systemd = "${bindir}/hailort8_service ${sysconfdir}/default/* ${systemd_system_unitdir}/*"

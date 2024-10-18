EXTRA_OECMAKE:append:class-target = "-DNEO_ENABLE_i915_PRELIM_DETECTION=TRUE"
PACKAGECONFIG:append:class-target = " levelzero"
DEPENDS += "${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)}"

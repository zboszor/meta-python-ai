PV = "2021.12.0"
SRCREV = "9afd759b72c0c233cd5ea3c3c06b0894c9da9c54"

SRC_URI:remove = "file://0001-CMakeLists.txt-exclude-riscv64-riscv32.patch"

FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"
SRC_URI:append = " file://0001-Don-t-use-upper-limit-for-GCC-version-in-concurrent_.patch"

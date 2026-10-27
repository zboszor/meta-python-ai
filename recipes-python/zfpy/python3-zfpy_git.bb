SUMMARY = "zfp compression in Python"

DEPENDS = "python3-numpy-native zfp python3-wheel-native"

inherit python_setuptools_build_meta cython

require zfp.inc

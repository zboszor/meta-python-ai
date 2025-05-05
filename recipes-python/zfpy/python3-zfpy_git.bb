SUMMARY = "zfp compression in Python"

DEPENDS = "python3-numpy-native zfp"

inherit python_setuptools_build_meta cython

require zfp.inc

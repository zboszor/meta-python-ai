SUMMARY = "A common runtime for AWS Python projects"

DEPENDS = "awscrt"

require awscrt.inc

inherit python_setuptools_build_meta

export AWS_CRT_BUILD_USE_SYSTEM_LIBS = "1"
export AWS_CRT_BUILD_USE_SYSTEM_LIBCRYPTO = "1"

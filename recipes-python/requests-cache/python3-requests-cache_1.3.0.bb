SUMMARY = "A persistent cache for python requests"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=66ca615c6f22205d5254d6c230305c92"

PYPI_PACKAGE = "requests_cache"

inherit pypi python_hatchling
SRC_URI[sha256sum] = "070e357ccef11a300ccef4294a85de1ab265833c5d9c9538b26cd7ba4085d54a"

RDEPENDS:${PN} = " \
	python3-requests \
	python3-urllib3 \
	python3-attrs \
	python3-cattrs \
	python3-platformdirs \
	python3-url-normalize \
	python3-boto3 \
	python3-botocore \
	python3-pymongo \
	python3-redis \
	python3-orjson \
	python3-itsdangerous \
	python3-pyyaml \
	python3-ujson \
"

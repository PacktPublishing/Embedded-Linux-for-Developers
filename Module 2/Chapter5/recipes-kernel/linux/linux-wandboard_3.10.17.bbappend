# Copyright Packt Publishing 2015
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"
SRC_URI_append = " file://defconfig \
                   file://0001-ARM-dts-Add-wandboard-custom-dts-file.patch"

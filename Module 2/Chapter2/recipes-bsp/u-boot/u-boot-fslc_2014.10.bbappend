# Copyright Packt Publishing 2015
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"
SRC_URI_append = " file://0001-wandboard-Change-board-info.patch \
                   file://0001-boards-Add-wandboard-custom.patch"

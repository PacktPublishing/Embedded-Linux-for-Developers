DESCRIPTION = "Example of data or configuration recipe"
SECTION = "examples"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/alexgg/examples.git \
           file://example.data"

S = "${WORKDIR}/git"

inherit allarch

do_compile() {
}

do_install() {
        install -d ${D}${sysconfdir}
        install -d ${D}${sbindir}
        install -m 0755 ${WORKDIR}/example.data ${D}/${sysconfdir}/
        install -m 0755 ${S}/python-scripts/* ${D}/${sbindir}
}

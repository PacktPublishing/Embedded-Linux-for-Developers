DESCRIPTION = "Minimal console image."

IMAGE_INSTALL= "\
        base-files \
        base-passwd \
        busybox \
        sysvinit \
        initscripts \
        ${ROOTFS_PKGMANAGE_BOOTSTRAP} \
        ${CORE_IMAGE_EXTRA_INSTALL} \
"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE ?= "8192"

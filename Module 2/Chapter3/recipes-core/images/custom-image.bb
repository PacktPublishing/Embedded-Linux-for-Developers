require recipes-core/images/core-image-minimal.bb

inherit extrausers

IMAGE_FEATURES += "ssh-server-dropbear package-management"

EXTRA_USERS_PARAMS = "\
    useradd -P password root; \
"

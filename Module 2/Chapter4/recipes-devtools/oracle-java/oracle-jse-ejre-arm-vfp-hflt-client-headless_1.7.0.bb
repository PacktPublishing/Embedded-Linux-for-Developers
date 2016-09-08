SUMMARY = "Oracle Java SE runtime environment binaries"

JDK_JRE = "ejre"

require recipes-devtools/oracle-java/oracle-jse.inc

PV_UPDATE = "75"
BUILD_NUMBER = "13"

LIC_FILES_CHKSUM = "\file://${WORKDIR}/${JDK_JRE}${PV}_${PV_UPDATE}/COPYRIGHT;md5=0b204bd2921accd6ef4a02f9c0001823 \
                     file://${WORKDIR}/${JDK_JRE}${PV}_${PV_UPDATE}/THIRDPARTYLICENSEREADME.txt;md5=f3a388961d24b8b72d412a079a878cdb \
"

SRC_URI = "http://download.oracle.com/otn/java/ejre/7u${PV_UPDATE}-b${BUILD_NUMBER}/ejre-7u${PV_UPDATE}-fcs-b${BUILD_NUMBER}-linux-arm-vfp-hflt-client_headless-18_dec_2014.tar.gz"

SRC_URI[md5sum] = "759ca6735d77778a573465b1e84b16ec"
SRC_URI[sha256sum] ="ebb6499c62fc12e1471cff7431fec5407ace59477abd0f48347bf6e89c6bff3b"

RPROVIDES_${PN} += "java2-runtime"

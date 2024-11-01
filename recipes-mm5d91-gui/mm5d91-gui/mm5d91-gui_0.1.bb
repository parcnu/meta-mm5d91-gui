SUMMARY = "mm5d91 Linux gui"
DESCRIPTION = "${SUMMARY}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://Makefile \
	   file://mm5d91_ioctl.h \
           file://usertestapp.c \
          "
#S = "${@'WORKDIR/source' if d.getVar('DISTRO_CODENAME') == 'styhead' else 'WORKDIR'}"
S = "${WORKDIR}"


do_install() {
	install -d ${D}${bindir}
	install -m 0755 usertestapp ${D}${bindir}
}

#FILES:${PN} += "${bindir}/usertestapp" 

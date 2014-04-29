SUMMARY = "Connecting Multiwii Flight Controler to QGroundControl with mavlink"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://src/example/example.c;startline=4;endline=5;md5=a5277927ccb6e33acae15a339b476a81"

SRC_URI = "git://github.com/treymarc/multiwii-mavlink-gc"
SRCREV = "7f43410f33dd7e2c1e85138607aee2e74ee80147"

REALPV = "1.0"
PV = "${REALPV}+git${SRCPV}"

S = "${WORKDIR}/git"

CFLAGS += " -std=c99 -g  -D_GNU_SOURCE "
EXTRA_OEMAKE = "VERBOSE=1"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/src/mavlink/mwgc-${REALPV} ${D}${bindir}
    install -m 0755 ${S}/src/example/log2csv ${D}${bindir}/mwgc-log2csv
}

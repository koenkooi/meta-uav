SUMMARY = "Connecting Multiwii Flight Controler to QGroundControl with mavlink"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://src/example/example.c;startline=4;endline=5;md5=a5277927ccb6e33acae15a339b476a81"

SRC_URI = "git://github.com/treymarc/multiwii-mavlink-gc"
SRCREV = "87add1e154fc17c4066a0b5b3c335536bd7fb799"

PV = "1.0+git${SRCPV}"

S = "${WORKDIR}/git"

CFLAGS += " -std=c99 -g  -D_GNU_SOURCE "
EXTRA_OEMAKE = "VERBOSE=1"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/src/mavlink/mwgc ${D}${bindir}
    install -m 0755 ${S}/src/example/log2csv ${D}${bindir}/mwgc-log2csv
}

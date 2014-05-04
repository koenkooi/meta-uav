SUMMARY = "Pair SIXAXIS with non-PS3 master"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://sixpair.c;md5=42d4ad3ca83d2434c1f37c1917cbe452"

DEPENDS = "libusb-compat"

SRC_URI = "file://sixpair.c"

do_configure() {
	cp ${WORKDIR}/*.c ${S}
}

do_compile() {
	${CC} ${CFLAGS} ${LDFLAGS} -o sixpair sixpair.c -lusb
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 sixpair ${D}${bindir}
}



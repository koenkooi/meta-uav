SUMMARY = "A C/C++ library to aid the use of Digi XBee radios in API mode"

LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRCREV = "79d133f939cc67643878b05f75c49ef66748f43a"
SRC_URI = "git://code.google.com/p/libxbee.libxbee-v3;protocol=https \
           file://skip-index.html.patch \
          "

S = "${WORKDIR}/git"

export CROSS_COMPILE="${TARGET_PREFIX}"
export GCC="${CC}"
CFLAGS =+ "-fPIC"

do_configure() {
	oe_runmake configure
}

PARALLEL_MAKEINST = ""
do_install() {
	install -d ${D}${libdir}
	install -d ${D}${datadir}/man/man3
	# prevent chown root:root from happening
	sed -i -e 's:chown:echo:g' -e 's:chmod:echo:g'  ${S}/make/install.unix.mk
	oe_runmake install SYS_ROOT=${D} INSTALL="install -D"
}

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
FILES_${PN}-dbg += "${libdir}/*dbg"
FILES_${PN}-staticdev += "${libdir}/*.a.*"

SUMMARY = "Groundcontrol for taulabs UAVs"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://main.cpp;beginline=13;endline=24;md5=c56f1a75d2ed8172799c20017162dc9a"

inherit qmake5

DEPENDS += "qtbase"

# '20140405' is the latest release listed at https://github.com/TauLabs/TauLabs/releases
PV = "20140405+git${SRCPV}"
SRCREV = "5e71e426966f3ef9a2dd43a31bd4e913dbaa57a7"
SRC_URI = "git://github.com/TauLabs/TauLabs.git;branch=next;protocol=https"

S = "${WORKDIR}/git/ground/uavobjgenerator"

OE_QMAKE_PATH_HEADERS = "${OE_QMAKE_PATH_QT_HEADERS}"

do_install() {
	install -d ${D}${bindir}
	install -m0755 uavobjgenerator ${D}${bindir}
}

BBCLASSEXTEND = "native nativesdk"

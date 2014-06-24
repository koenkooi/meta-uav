SUMMARY = "QGroundControl Ground Control Station" 
HOMEPAGE = "http://qgroundcontrol.org"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://license.txt;md5=68761bfca0e15a36d3d53528e5239dc5"

inherit qt4x11

DEPENDS += "udev libsdl espeak"

PV = "2.03"
SRCREV = "2e4ac6be5e198fd81553f366992f6d0507afca9b"
SRC_URI = "gitsm://github.com/mavlink/qgroundcontrol.git;protocol=https \
           file://0001-QGCExternalLibs.pri-don-t-search-host-directoryies-f.patch \
           file://0002-utils_external.pri-add-consoleprocess_unix.cpp-to-al.patch \
           file://qgc.desktop \
         "

S = "${WORKDIR}/git"

QMAKE_PROFILES = "qgroundcontrol.pro"

# $CXX is used to see which platform we're on, fall back to linux instead of erroring out
do_configure_prepend() {
	sed -i -e 's:error(Unsupported build type):CONFIG += LinuxBuild:' ${S}/qgroundcontrol.pro
	sed -i -e 's:(/usr/include/:(${STAGING_INCDIR}/:g' ${S}/QGCExternalLibs.pri
}

do_install_append() {
	install -d ${D}${bindir}
	install -m 0755 release/qgroundcontrol ${D}${bindir}	

	install -d ${D}${datadir}/pixmaps
	install -m 0644 ${S}/files/images/icons/v2/t128.png ${D}${datadir}/pixmaps/

	install -d ${D}${datadir}/applications
	install -m 0644 ${WORKDIR}/qgc.desktop ${D}${datadir}/applications/	
}

RDEPENDS_${PN} += "qt4-plugin-sqldriver-sqlite \
                   qt4-plugin-phonon-backend-gstreamer \
                   qt4-plugin-imageformat-svg \
                   qt4-plugin-imageformat-jpeg \
                   qt4-plugin-imageformat-ico \
                  "


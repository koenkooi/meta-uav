SUMMARY = "QGroundControl Ground Control Station" 
HOMEPAGE = "http://qgroundcontrol.org"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://license.txt;md5=68761bfca0e15a36d3d53528e5239dc5"

inherit qt4x11

DEPENDS += "udev libsdl espeak"

PV = "2.01"
SRCREV = "2b2c826bc38c8f1add88926a792a6f058bc0dd20"
SRC_URI = "gitsm://github.com/mavlink/qgroundcontrol.git;protocol=https \
           file://0001-QGCExternalLibs.pri-don-t-search-host-directoryies-f.patch \
           file://0001-utils_external.pri-add-consoleprocess_unix.cpp-to-al.patch \
           file://0002-Make-HUD-the-center-widget-in-Flight-view.-Add-menu-.patch \
           file://0003-hud-is-a-tool-in-VIEW_FLIGHT.patch \
           file://0004-MainWindow-handle-maptool-widget-destroy-event.patch \
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

	install -d ${D}${datadir}
	# ${S}/files/images/icons/v2/t128.png
}

RDEPENDS_${PN} += "qt4-plugin-sqldriver-sqlite \
                   qt4-plugin-phonon-backend-gstreamer \
                   qt4-plugin-imageformat-svg \
                   qt4-plugin-imageformat-jpeg \
                   qt4-plugin-imageformat-ico \
                  "


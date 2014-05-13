SUMMARY = "Lightweight robotics middleware for Linux/Unix systems"
HOMEPAGE = "http://pixhawk.ethz.ch/wiki/software/middleware/"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://CMakeLists.txt;beginline=15;endline=30;md5=64c970c4052930910793b7ecf09cfdc7"

DEPENDS = "glib-2.0 glibmm opencv libgtop mavlink gsl zlib lcm boost"
#roscpp

PV = "0.0"
SRCREV_mavconn = "b976cca26b2c468df08deaa59b8d518116c1f280"
SRC_URI = "git://github.com/pixhawk/mavconn.git;name=mavconn \
           file://0001-Remove-Bluefox-libs-from-INSTALL-it-s-an-x86-binary-.patch \
           file://baf4a55d4f4c7351897912f70148a14d5e587608.patch \
          "

S = "${WORKDIR}/git"

inherit cmake pythonnative
OECMAKE_SOURCEPATH = "${S}"
OECMAKE_BUILDPATH = "${S}/build-${TARGET_ARCH}-${PV}"

EXTRA_OECMAKE = " \
                 -DMAVLINK_IncludeSearchPaths=${STAGING_INCDIR}/mavlink/v1.0 \
                 -DMAVLINK_INCLUDE_DIR=${STAGING_INCDIR}/mavlink/v1.0 \
                 -DMAVLINK_TYPES_INCLUDE_DIR=${STAGING_INCDIR}/mavlink/v1.0 \
                "


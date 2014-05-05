SUMMARY = "This is a python implementation of the MAVLink protocol. "
HOMEPAGE = "http://qgroundcontrol.org/mavlink/"

LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://README.txt;md5=2fc3900b33c4131645987a81bfe6a55f"

SRCREV = "ff5b92efd537522c64afbd333696c473dd8adf89"
SRC_URI = "git://github.com/mavlink/mavlink.git"

S = "${WORKDIR}/git/pymavlink"

inherit setuptools


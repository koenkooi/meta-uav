SUMMARY = "This is a python implementation of the MAVLink protocol. "
HOMEPAGE = "http://qgroundcontrol.org/mavlink/"

LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://README.txt;md5=2fc3900b33c4131645987a81bfe6a55f"

SRCREV = "01814e3b5da40c231b39dcae4dd63ac6ff042424"
SRC_URI = "git://github.com/mavlink/mavlink.git"

S = "${WORKDIR}/git/pymavlink"

inherit setuptools


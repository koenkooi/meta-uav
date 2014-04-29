SUMMARY = "This is a python implementation of the MAVLink protocol. "
HOMEPAGE = "http://qgroundcontrol.org/mavlink/"

LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://README.txt;md5=2fc3900b33c4131645987a81bfe6a55f"

SRCREV = "198849ff058daa50a15d3d6ed2adf2fda5de1cc2"
SRC_URI = "git://github.com/mavlink/mavlink.git"

S = "${WORKDIR}/git/pymavlink"

inherit setuptools


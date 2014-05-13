SUMMARY = "This is a python implementation of the MAVLink protocol. "
HOMEPAGE = "http://qgroundcontrol.org/mavlink/"

LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://README.txt;md5=2fc3900b33c4131645987a81bfe6a55f"

SRCREV = "b3a004f181b6b181413fdf9cbe4135b546bb7d24"
SRC_URI = "git://github.com/mavlink/mavlink.git"

S = "${WORKDIR}/git/pymavlink"

inherit setuptools


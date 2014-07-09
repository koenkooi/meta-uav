SUMMARY = "This is a python implementation of the MAVLink protocol. "
HOMEPAGE = "http://qgroundcontrol.org/mavlink/"

LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://README.txt;md5=2fc3900b33c4131645987a81bfe6a55f"

SRCREV = "5a30dbf2546a131fd1529efeaead825e332f70cc"
SRC_URI = "git://github.com/mavlink/mavlink.git"

S = "${WORKDIR}/git/pymavlink"

inherit setuptools


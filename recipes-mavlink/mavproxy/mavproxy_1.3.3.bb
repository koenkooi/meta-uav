SUMMARY = "This is a MAVLink ground station written in python."
HOMEPAGE = "http://tridge.github.io/MAVProxy/"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://README.txt;md5=0937e1e6199a81c44d3c700a4f1b05bb"

SRCREV = "dad650dde9503b6ba4864ed1f55bdc3e9361df61"
SRC_URI = "git://github.com/tridge/MAVProxy.git"

S = "${WORKDIR}/git"

inherit setuptools

RDEPENDS_${PN} += "python-pyserial \
                   pymavlink \
                   python-matplotlib \
                   python-numpy \
                   python-imaging \
                   python-opencv \
                   python-pyparsing \
                   wxpython \
                  "

SUMMARY = "Lightweight Communications and Marshalling"

LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=58f4394e20cf65bea09efdc8b430c0bd"

DEPENDS = "glib-2.0"

SRC_URI = "https://lcm.googlecode.com/files/lcm-1.0.0.tar.gz"
SRC_URI[md5sum] = "69bfbdd9e0d7095c5d7423e71b2fb1a9"
SRC_URI[sha256sum] = "464fc1c8a58a502fe0c9e136cdf979ae9ed7d2a62bf255461b3c151ec69d9c1c"

inherit gettext autotools

EXTRA_OECONF = " \
                 --without-python \
                 --without-java \
                 --without-lua \
               "


SUMMARY = "nl80211 based CLI configuration utility for wireless devices"
DESCRIPTION = "iw is a new nl80211 based CLI configuration utility for \
wireless devices. It supports almost all new drivers that have been added \
to the kernel recently. "
HOMEPAGE = "http://wireless.kernel.org/en/users/Documentation/iw"
SECTION = "base"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING;md5=878618a5c4af25e9b93ef0be1a93f774"

DEPENDS = "libnl pkgconfig"

SRC_URI = "http://www.kernel.org/pub/software/network/iw/${P}.tar.gz \
"

SRC_URI[md5sum] = "68c282285c71c956069957e9ca10a6a7"
SRC_URI[sha256sum] = "14bfc627b37f7f607e4ffa63a70ded15fa2ea85177f703cb17d7fe36f9c8f33d"

EXTRA_OEMAKE = ""

do_install() {
    oe_runmake DESTDIR=${D} install
}

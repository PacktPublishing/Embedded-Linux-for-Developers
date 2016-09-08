#!/bin/bash

KERNEL=zImage
DTB=vexpress-v2p-ca9.dtb

if [ ! -f ${KERNEL} ]; then
	echo "${KERNEL} does not exist"
	exit 1
fi
if [ ! -f ${DTB} ]; then
	echo "${DTB} does not exist"
	exit 1
fi
ROOTDIR=/home/chris/build/MELP/rootdirs/rootfs

HOST_IP=192.168.1.1
TARGET_IP=192.168.1.101
NET_NUMBER=192.168.1.0
NET_MASK=255.255.255.0

sudo tunctl -u $(whoami) -t tap0
sudo ifconfig tap0 ${HOST_IP}
sudo route add -net ${NET_NUMBER} netmask ${NET_MASK} dev tap0
sudo sh -c "echo  1 > /proc/sys/net/ipv4/ip_forward"

# NAT for emulated device via wlan0 interface on the host PC
# After booting, add a default route in the emulated system
#  route add default gw 192.168.1.1
# and make sure that /etc/resolv.conf contains a valid address
# (8.8.8.8 is a good choice)
# Note that any firewall on the host will most likely block traffic
sudo iptables -t nat -A POSTROUTING -o wlan0 -j MASQUERADE

QEMU_AUDIO_DRV=none \
qemu-system-arm -m 256M -nographic -M vexpress-a9 -kernel $KERNEL -append "console=ttyAMA0 root=/dev/nfs rw nfsroot=${HOST_IP}:${ROOTDIR} ip=${TARGET_IP}" -dtb ${DTB} -net nic -net tap,ifname=tap0,script=no


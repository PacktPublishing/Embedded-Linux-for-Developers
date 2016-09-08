LINUXDIR := $(HOME)/build/MELP/build/linux

obj-m := dummy.o

all:
	make ARCH=arm CROSS_COMPILE=arm-cortex_a8-linux-gnueabihf- \
		 -C $(LINUXDIR) M=$(shell pwd)

clean:
	make -C $(LINUXDIR) M=$(shell pwd) clean


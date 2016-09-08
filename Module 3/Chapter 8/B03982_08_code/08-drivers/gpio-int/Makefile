
CC=$(CROSS_COMPILE)gcc
CFLAGS=-Wall -g
PROGS=gpio-int

all: $(PROGS)

gpio-int: gpio-int.c
	$(CC) $(CFLAGS) -o $@ $^

clean:
	rm -f *.o
	rm -f $(PROGS)

install:
	cp $(PROGS) $(TARGET_DIR)/bin

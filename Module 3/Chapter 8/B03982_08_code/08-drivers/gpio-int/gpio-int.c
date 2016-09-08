#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <poll.h>

int main (int argc, char *argv[])
{
	int f;
	char *gpio_value = "/sys/class/gpio/gpio48"; // LEFT button on LCD4 panel (BBB)
	char gpio_value_path [128];
	struct pollfd poll_fds [1];
	int ret;
	char value[4];
	int n;

	if (argc == 2)
		gpio_value = argv[1];

	sprintf(gpio_value_path, "%s/value", gpio_value);
	f = open(gpio_value_path, O_RDONLY);
	if (f == -1) {
		printf("Failed to open %s\n", gpio_value_path);
		exit(1);
	}

	poll_fds[0].fd = f;
	poll_fds[0].events = POLLPRI | POLLERR;

	while (1) {
		printf("Waiting\n");
		ret = poll(poll_fds, 1, -1);
		if (ret > 0) {
			n = read(f, &value, sizeof(value));
			printf("Button pressed: read %d bytes, value=%c\n", n, value[0]);
		}
	}

	return 0;
}


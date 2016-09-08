#include <stdio.h>
#include <lttng/tracef.h>

int main(void)
{
    tracef("I said: %s", "Hello World");
    return printf("Hello World");
}

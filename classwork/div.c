// div.c
#include "demo.h"

int DIV(int a, int b) {
    if (b != 0)
        return a / b;
    else
        return 0; // or handle divide-by-zero
}

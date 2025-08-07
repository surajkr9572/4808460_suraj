// main.c
#include <stdio.h>
#include "demo.h"

int main() {
    int a, b;
    printf("Enter two numbers: ");
    scanf("%d%d", &a, &b);

    printf("Sum: %d\n", SUM(a, b));
    printf("Subtraction: %d\n", SUB(a, b));
    printf("Multiplication: %d\n", MUL(a, b));
    printf("Division: %d\n", DIV(a, b));

    return 0;
}

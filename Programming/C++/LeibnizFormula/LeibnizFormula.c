#include <math.h>
#include <stdio.h>

/*
Leibniz formula for calculting pi
------------------------------------
Sums the reciprocals of consecutive odd numbers, switching signs each time, then multiplies by 4.
Somehow gives you an approximation of pi.
*/

double leibniz_step(int k) {
    return pow(-1, k) / (2 * k + 1);
}

double leibniz(int k) {
    double sum = 0.0;
    int i;

    for (i=0; i<k; i++) {
        sum += leibniz_step(i);
    }

    return sum*4;
}

int main() {
    printf("%.16f", leibniz(10000));
}

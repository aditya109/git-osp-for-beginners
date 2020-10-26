#include <stdio.h>

float leibnizPi(float n) {
    double pi=1.0;
    int i;
    int N;
    for (i=3, N=2*n+1; i<=N; i+=2)
        pi += ((i&2) ? -1.0 : 1.0) / i;
    return 4*pi;
}

int main(void)
{
    float n;
    printf("Enter n----");
    scanf("%f",&n);
    printf("Pi: %f\n", leibnizPi(n));
    return 0;
}

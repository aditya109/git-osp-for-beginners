#include <cmath>
#include <iomanip>
#include <iostream>

/*
Leibniz formula for calculting pi
------------------------------------
Sums the reciprocals of consecutive odd numbers, switching signs each time, then multiplies by 4.
Somehow gives you an approximation of pi.
*/

long double leibniz(int k) {
    long double pi = 0.0;
    for (int i = 0; i < k; i++) { 
        pi += (std::pow(-1, i) / (2 * i + 1)); 
    }
    return pi*4.0;
}

int main() {
    std::cout << std::setprecision(32) << leibniz(100000) << std::endl;
}
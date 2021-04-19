#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <stdint.h>
#include <time.h>

uint32_t gcd(uint32_t a, uint32_t b)
{
    uint32_t temp;
    while (b != 0)
    {
        temp = a % b;

        a = b;
        b = temp;
    }
    return a;
}
int check_coprimity(uint32_t a, uint32_t b){
    return gcd(a, b) == 1;
}

int main(int argc, char** argv){
    uint32_t coprime_counter = 0;
    uint32_t sample_size = 1000000;
    srand(time(NULL) % randy());

    for (uint32_t i = 0; i < sample_size; i++){
        if (check_coprimity(rand(), rand())){
            coprime_counter++;
        }
    }
    double pi = sqrt(6 / ((long double)coprime_counter / (long double)sample_size));
    printf("%.20f\n", pi);
    return 0;
}
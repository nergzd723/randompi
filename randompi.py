import random
import math

def gcd(p, q):
    while q != 0:
        p, q = q, p%q
    return p

def check_coprimity(x, y):
    return gcd(x, y) == 1

ranges = 1024
sample_size = 25000000
coprime_counter = 0
for i in range(sample_size):
    if check_coprimity(random.randint(0, ranges), random.randint(0, ranges)):
        coprime_counter += 1

print(coprime_counter, sample_size)
x = float(coprime_counter) / float(sample_size)
pi = math.sqrt(6 / x)
print(coprime_counter, pi)

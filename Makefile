CC = clang

all:
	$(CC) randompi.c -Ofast -lm -masm=intel -march=native -o randompi
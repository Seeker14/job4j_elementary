package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for ( ; n >= 1; n--) {
            result = result * n;
        }
        return result;
    }
}

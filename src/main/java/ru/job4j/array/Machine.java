package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    @SuppressWarnings("checkstyle:LeftCurly")
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int chips = money - price;
        for (int coin : coins) {
            while (chips >= coin) {
                chips -= coin;
                rsl[size++] = coin;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}

package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return Math.max(left, right);
    }

    public static int max(int left, int right, int bottom) {
        return max(max(left, right), bottom);
    }

    public static int max(int left, int right, int bottom, int top) {
        return max(max(left, right, bottom), top);
    }

    public static void main(String[] args) {
        int max = Max.max(5, 3);
        System.out.println(max);
        max = Max.max(1, 2);
        System.out.println(max);
    }
}

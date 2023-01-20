package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        double sum = amount + amount * percent / 100;
        while (salary < sum) {
            sum -= salary;
            year++;
        }
        return year;
    }
}

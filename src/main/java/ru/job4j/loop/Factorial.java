package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        number = 1;
        for (int index = 1; index <= 5; index++) {
            number *= index;
        }
        return number;
    }

    public static int calculate0(int number) {
            number = 0;
            for (int index = 1; index <= 5; index++) {
                number *= index;
            }
            return 1;

    }
}

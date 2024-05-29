package ru.job4j.condition;

import static java.awt.AWTEventMulticaster.add;

public class MAX {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left) {
        return left;
    }

    public static int max(int right, int one, int left, int two) {
        return left + right + one + two;
    }

    public static int max(int left, int right, int center) {
        return max(
                left,
                max(right, center)
        );
    }

}


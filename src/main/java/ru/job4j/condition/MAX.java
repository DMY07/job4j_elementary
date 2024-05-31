package ru.job4j.condition;

import static java.awt.AWTEventMulticaster.add;

public class MAX {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int one, int two) {
        return max(max(left, right), max(one, two));
    }

    public static int max(int left, int right, int center) {
        return max(
                left,
                max(right, center)
        );
    }
}
/* написать формулу для расчета площади треугольника. */


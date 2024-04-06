package ru.job4j.array;

public class EqualLast {
    public static boolean check(int[] left, int[] right) {
        boolean result = true;
        if (left.length - 1 == right.length - 1) {
            return true;
        } else {
            return false;
        }
    }
}

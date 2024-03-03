package ru.job4j.condition;

public class MAX {
    public static int max(int left, int right) {
        boolean number = left > right;
        right = 2;
        left = 1;
        int result = number ? left : right;
        return result;
    }
}

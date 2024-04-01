package ru.job4j.array;

public class FindLoop {

    public static int indexOf(int[] data, int element) {
        int result = -1;
        for (result = 0; result < data.length; result++) {
            if (data[result] == element) {
                break;
            }
        }
        return result;
    }
}

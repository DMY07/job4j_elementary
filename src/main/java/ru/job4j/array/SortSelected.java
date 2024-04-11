package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int index = 0; index <= data.length - 1; index++) {
            int min = MinDiapason.findMin(data, index, data.length - 1);
            if (data[index] <= min) {
                min = data[index];
                int i = FindLoop.indexInRange(data, min, index, data.length - 1);
                if (data[i] == index) {
                    break;
                }
                int[] temp = SwitchArray.swap(data, index, data[0]);
                data[i] = data[data.length - 1];
                data[data.length - 1] = data[i];
            }
            }
        return data;
    }
}
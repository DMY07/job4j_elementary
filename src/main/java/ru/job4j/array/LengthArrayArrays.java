package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{5}, {2, 1}, {7, 7, 7}, {9, 6, 3, 1} };
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(
                    "Размер вложенного массива равен: " + numbers[i].length
            );
        }
    }
}


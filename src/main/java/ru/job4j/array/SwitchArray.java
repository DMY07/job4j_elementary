package ru.job4j.array;

public class SwitchArray {

    public static int[] swapBorder(int[] numbers) {
        int temp = numbers[0];
        numbers[0] = numbers[numbers.length];
        numbers[numbers.length] = temp;
        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6};
        int[] result = swapBorder(numbers);
        for (int index = 0; index < result.length; index++) {
            System.out.println(result[index]);
        }
    }
}

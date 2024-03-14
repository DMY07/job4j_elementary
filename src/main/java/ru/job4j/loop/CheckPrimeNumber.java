package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        int hold = 0;
        for (int index = 2; index <= number - 1; index++) {
            hold += index;
            if (hold == number) {
                break;
            } else if (number % hold == 0) {
                break;
            } else  {
                return false;
            }
            }
        return prime;
    }
}
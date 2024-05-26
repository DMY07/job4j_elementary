package ru.job4j.calculator;

public class Fit {
    private static final double COEFFICIENT = 1.15;
    private static final int MAN_OFFSET = 100;
    private static final int WOMAN_OFFSET = 110;

    public static double calculateManIdealWeight(short height) {
        return (height - MAN_OFFSET) * COEFFICIENT;
    }

    public static double calculateWomanIdealWeight(short height) {
        return (height - WOMAN_OFFSET) * COEFFICIENT;
    }

    public static void main(String[] args) {
        short heightMan = 187;
        short heightWoman = 170;
        double man = Fit.calculateManIdealWeight(heightMan);
        System.out.println("Man 187 is " + man);
        double woman = Fit.calculateWomanIdealWeight(heightWoman);
        System.out.println("Woman 170 is " + woman);
    }
}

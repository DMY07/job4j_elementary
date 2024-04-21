package ru.job4j.calculator;

public class Fit {

    public static double calculateManWeight(short heightMan) {
        double result = (heightMan - 100) * 1.15;
        return result;
    }

    public static double calculateWomanWeight(short heightWoman) {
        double result = (heightWoman - 110) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        short heightMan = 187;
        short heightWoman = 170;
        double man = Fit.calculateManWeight(heightMan);
        System.out.println("Maan 187 is " + man);
        double woman = Fit.calculateWomanWeight(heightWoman);
        System.out.println("Woman 170 is " + woman);
    }
}

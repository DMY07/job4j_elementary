package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        boolean passed1 = expected == output;
        System.out.println("140 rubles are 2 Euro. Test result : " + passed1);
        float expectedDollar = 4;
        float outputDollar = Converter.rubleToDollar(input);
        boolean passed2 = outputDollar == expectedDollar;
        System.out.println("140 rubles are 4 Dollar. Test result : " + passed2);
        }
}

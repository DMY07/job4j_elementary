package ru.job4j.array;
public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива равен: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + prices.length);
        String[] name = new String[4];
        name[0] = "Anna";
        name[1] = "Коля";
        name[2] = "Маша";
        name[3] = "Даша";
        System.out.println(name[3]);
        System.out.println(name[2]);
        System.out.println(name[1]);
        System.out.println(name[0]);
    }
}

package ru.job4j.converter;

public class ConverterNew {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
       return value / 60;
    }

    public static void main(String[] args) {
        System.out.println("140 rubles are " + rubleToEuro(140) + " euro");
        System.out.println("140 rubles are " + rubleToDollar(140) + " dollar");
    }
}

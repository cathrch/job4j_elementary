package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in = 140;
        float expectedE = 2;
        float expectedD = 2.3333333F;
        float outE = Converter.rubleToEuro(in);
        float outD = Converter.rubleToDollar(in);
        boolean passedE = expectedE == outE;
        boolean passedD = expectedD == outD;
        System.out.println("140 rubles are 2 Euro. Test result " + passedE);
        System.out.println("140 rubles are 2.333333 Dollars. Test result " + passedD);
    }
}

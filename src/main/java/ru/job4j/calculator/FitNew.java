package ru.job4j.calculator;

public class FitNew {
    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        System.out.println("Man height = " + manWeight(164));
        System.out.println("Female weight" + womanWeight(153));

    }
}

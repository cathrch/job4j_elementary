package ru.job4j.calculator;

public class Fit {
    public static double maleWeight(double weight) {
        return (weight - 100) * 1.15;
    }

    public static double femaleWeight(double weight) {
        return  (weight - 110) * 1.15;
    }

    public static void main(String[] args) {
        short manHeight = 180;
        double male = Fit.maleWeight(manHeight);
        short womanHeight = 170;
        double female = Fit.femaleWeight(womanHeight);
        System.out.println("При росте " + manHeight + " идеальный вес мужчины: " + male);
        System.out.println("При росте " + womanHeight + " идеальный вес женщины: " + female);
    }
}

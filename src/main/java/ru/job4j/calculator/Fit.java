package ru.job4j.calculator;

public class Fit {
    public static double maleWeight(double weight) {
        double ideal = (weight - 100) * 1.15;
        return ideal;
    }

    public static double femaleWeight(double weight) {
        double ideal = (weight - 110) * 1.15;
        return ideal;
    }

    public static void main(String[] args) {
        short manHeight = 187;
        double male = Fit.maleWeight(manHeight);
        short womanHeight = 160;
        double female = Fit.femaleWeight(womanHeight);
        System.out.println("При росте " + manHeight + " идеальный вес мужчины: " + male);
        System.out.println("При росте " + womanHeight + " идеальный вес женщины: " + female);
    }
}

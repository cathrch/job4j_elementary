package ru.job4j.condition;

public class RectangleArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return h * l;
    }

    public static void main(String[] args) {
        System.out.println("p = 6, k = 2, s = " + square(6, 2));
    }
}

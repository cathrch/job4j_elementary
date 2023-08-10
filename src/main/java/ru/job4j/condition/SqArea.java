package ru.job4j.condition;

public class SqArea {
    public static double sqarea(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return h * l;
    }

    public static void main(String[] args) {
        double res = SqArea.sqarea(10, 5);
        System.out.println("p = 6, k = 2, s = " + res);
    }

}

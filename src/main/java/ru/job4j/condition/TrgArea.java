package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - c) * (p - c));
        return s;
    }

    public static void main(String[] args) {
       double res = TrgArea.area(2, 2, 2);
       System.out.println("Area (2, 2, 2) = " + res);
    }
}

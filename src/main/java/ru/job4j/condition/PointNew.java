package ru.job4j.condition;

public class PointNew {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        System.out.println("(-2;2) to (5;5) = " + distance(-2, 2, 5, 5));
    }
}

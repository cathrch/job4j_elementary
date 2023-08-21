package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double bc, double ac) {
        return (ab + ac > bc) && (bc + ab > ac) && (ac + bc > ab);
    }

    public static void main(String[] args) {
        boolean res = Triangle.exist(2, 2, 3);
        System.out.println(res);
    }
}

package ru.job4j;
import java.util.Scanner;
public class Task15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double r = input.nextDouble();
        System.out.println(a + a + a + a);
        System.out.printf("%.1f%n", 2 * Math.PI * r);
        System.out.printf("%.1f", Math.PI * r * r);
    }
}

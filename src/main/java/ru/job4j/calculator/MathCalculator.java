package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double divAndSub(double first, double second) {
        return division(first, second) + subtraction(first, second);
    }

    public static double generalSum(double first, double second) {
        return sumAndMultiply(first, second) + divAndSub(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат первого расчета равен: " + sumAndMultiply(2, 1));
        System.out.println("Результат второго расчета равен: " + divAndSub(2, 1));
        System.out.println("Общая сумма равна: " + generalSum(2, 1));
    }
}

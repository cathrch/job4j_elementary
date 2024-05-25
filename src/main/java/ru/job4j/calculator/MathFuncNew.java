package ru.job4j.calculator;

public class MathFuncNew {
    public static int func1(int x) {
        return x * x + 1;
    }

    public static int func2(int x) {
        return 1 / x;
    }

    public static void main(String[] args) {
        System.out.println(func1(3) + func2(1));
    }
}

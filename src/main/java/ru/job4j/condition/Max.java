package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
       // boolean
        int result = left > right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int number = Max.max(
                4, 7);
        System.out.println("Max number: " + number);
    }
}

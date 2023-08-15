package ru.job4j.condition;

public class AllertDivByZero {
    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Could not div by 0.");
        }
    }

    public static void negativNum(int number) {
        if (number < 0) {
            System.out.println("This is negativ number");
        }
    }

    public static void main(String[] args) {
        AllertDivByZero.possibleDiv(4);
        AllertDivByZero.negativNum(-8);
        AllertDivByZero.possibleDiv(0);
        AllertDivByZero.negativNum(-3);
    }
}

package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MortgageTest {

    @Test
    void whenAmount1000Salary1200Percent1ThanYear1() {
        int amount = 1000;
        int selary = 1200;
        double percent = 1;
        int result = Mortgage.year(amount, selary, percent);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenAmount100Salary120Percent50ThanYear1() {
        int amount = 100;
        int selary = 120;
        double percent = 50;
        int result = Mortgage.year(amount, selary, percent);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenAmount1000Salary1200Percent20ThanYear1() {
        int amount = 1000;
        int selary = 1200;
        double percent = 20;
        int result = Mortgage.year(amount, selary, percent);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}
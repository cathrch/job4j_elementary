package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SqAreaTest {

    @Test
    void whenP6K2ThenS2() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.sqarea(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP1K2ThenS005() {
        double expected = 0.05;
        int p = 1;
        int k = 2;
        double out = SqArea.sqarea(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP10K5ThenS347() {
        double expected = 3.47;
        int p = 10;
        int k = 5;
        double out = SqArea.sqarea(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}
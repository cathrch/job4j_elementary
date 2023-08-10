package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMan180Than92() {
        short in = 180;
        double expected = 92;
        double out = Fit.maleWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman170Then69() {
        short in = 170;
        double expected = 69;
        double out = Fit.femaleWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}
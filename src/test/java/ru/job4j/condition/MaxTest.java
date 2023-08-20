package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void when1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(1, 2);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when4To2Then4() {
        int left = 4;
        int right = 2;
        int result = Max.max(4, 2);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when6To6Then6() {
        int left = 6;
        int right = 6;
        int result = Max.max(6, 6);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }
}
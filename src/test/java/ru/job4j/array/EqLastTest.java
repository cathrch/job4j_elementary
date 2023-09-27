package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class EqLastTest {

    @Test
    public void whenEq() {
        int[] left = {1, 2, 3};
        int[] right = {5, 4, 3};
        boolean result = EqLast.check(left, right);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotEq() {
        int[] left = {1, 2, 3};
        int[] right = {5, 4, 2};
        boolean result = EqLast.check(left, right);
        assertThat(result).isFalse();
    }
}
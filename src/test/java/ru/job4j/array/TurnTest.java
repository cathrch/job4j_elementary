package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TurnTest {

    @Test
    void whenTurnArrayWithEvenElementsThenArray() {
        int[] input = {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = {2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnArrayWithNotEvenElementsThenArray() {
        int[] input = {4, 1, 6, 2, 8};
        int[] result = Turn.back(input);
        int[] expected = {8, 2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }
}
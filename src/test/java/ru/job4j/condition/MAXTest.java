package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static ru.job4j.condition.MAX.max;

class MAXTest {

    @Test
    void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax55To77Then77() {
        int left = 55;
        int right = 77;
        int result = max(left, right);
        int expected = 77;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax22To22Then22() {
        int left = 22;
        int right = 22;
        int result = max(left, right);
        int expected = 22;
        assertThat(result).isEqualTo(expected);
    }
}
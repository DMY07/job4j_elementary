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
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To1Then1() {
        int left = 1;
        int right = 1;
        int result = max(left, right);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}
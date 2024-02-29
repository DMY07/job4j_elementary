package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.withPrecision;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RectangleAreaTest {

    @Test
    void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP10K5Square3dot472() {
        double expected = 3.472;
        int p = 10;
        double k = 5;
        double output = RectangleArea.square1(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP99K11Square187dot17() {
        double expected = 187.17;
        int p = 99;
        double k = 11;
        double output = RectangleArea.square2(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
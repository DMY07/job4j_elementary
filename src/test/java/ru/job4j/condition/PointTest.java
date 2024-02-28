package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.withPrecision;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when1112to3333then31dot112() {
            double expected = 31.112;
            int x3 = 11;
            int y3 = 22;
            int x4 = 33;
            int y4 = 44;
            double output = Point.distance(x3, y3, x4, y4);
            assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when01to80then8dot062() {
        double expected = 8.062;
        int x5 = 0;
        int y5 = 1;
        int x6 = 8;
        int y6 = 0;
        double output = Point.distance(x5, y5, x6, y6);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
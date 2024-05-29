package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.withPrecision;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when1112to3333then31dot112() {
        double expected = 31.112;
        Point q = new Point(11, 22);
        Point w = new Point(33, 44);
        double output = q.distance(w);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when01to80then8dot062() {
        double expected = 8.062;
        Point r = new Point(0, 1);
        Point t = new Point(8, 0);
        double output = r.distance(t);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
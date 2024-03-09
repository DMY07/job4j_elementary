package ru.job4j.loop;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.job4j.loop.Counter.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    void s0f10r55() {
    int start = 0;
    int finish = 10;
    int expected = 55;
    assertThat(sum(start, finish)).isEqualTo(expected);
    }

    @Test
    void s3f8r33() {
        int start = 3;
        int finish = 8;
        int expected = 33;
        assertThat(sum(start, finish)).isEqualTo(expected);
    }

    @Test
    void s1f1r1() {
        int start = 1;
        int finish = 1;
        int expected = 1;
        assertThat(sum(start, finish)).isEqualTo(expected);
    }

    @Test
    void s10f0r0() {
        int start = 10;
        int finish = 0;
        int expected = 0;
        assertThat(sum(start, finish)).isEqualTo(expected);
    }
}
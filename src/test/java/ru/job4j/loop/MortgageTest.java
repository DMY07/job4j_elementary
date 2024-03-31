package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MortgageTest {

    @Test
    void whenAmount1000Salary1200Percent1ThenYear1() {
        int amount = 1000;
        int salary = 1200;
        double percent = 1;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenAmount1000Salary1200Percent20ThenYear1() {
        int amount = 1000;
        int salary = 1200;
        double percent = 20;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}
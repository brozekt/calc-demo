package com.math.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyValueServiceTest {
    @Test
    void shouldReturn20() {
        MultiplyValueService calc = new MultiplyValueService(); // MyClass is tested

        assertEquals(20, calc.multiply(4,5), "4 x 5  has to be equal to 20");
    }
}
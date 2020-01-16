package com.math.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddValueServiceTest {
    @Test
    void shouldReturn4() {
        AddValueService calc = new AddValueService(); // MyClass is tested

        assertEquals(1, calc.add(0,1), "0 plus 1 has to equal 1");
    }
}
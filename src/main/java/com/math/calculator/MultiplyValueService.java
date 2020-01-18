package com.math.calculator;

import org.springframework.stereotype.Service;

@Service
public class MultiplyValueService {
    public int multiply(int x, int y) {
        return x*y;
    }
}
package com.math.calculator;


import org.springframework.stereotype.Service;

@Service
public class AddValueService {
    public int add(int x, int y) {
        return x + y;
    }
}
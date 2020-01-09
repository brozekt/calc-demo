package com.epam.calcdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AddValueService {
    @Value("${additional.incrementor:0}")
    private int additionalIncrementor;

    public int add(int x, int y) {
        return x + y + additionalIncrementor;
    }
}
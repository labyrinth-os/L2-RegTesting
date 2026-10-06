package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.example.Calculator;

public class CalculatorTest {
    
    @Test
    void addTest(){
        Calculator cal = new Calculator();
        assertEquals(5,cal.add(2,3));
    }

}

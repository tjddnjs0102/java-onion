package org.java.onion.chapter2.testandrefactor;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorV6Test {
    private CalculatorV2 cal;


    @BeforeEach // JUnit5 (JUnit4에서는 @Before)
    public void setup() {
        cal = new CalculatorV2();
    }


    @Test
    public void add() {
        assertEquals(9, cal.add(6,3));
    }

    @Test
    public void subtract() {
        assertEquals(3, cal.subtract(6,3));
    }
}

// V7에서는 @After 어노테이션을 사용해본다.
package org.java.onion.chapter2.practice;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorV7Test {
    private CalculatorV2 cal;


    @BeforeEach // JUnit5 (JUnit4에서는 @Before)
    public void setup() {
        cal = new CalculatorV2();
        System.out.println("before");
    }


    @Test
    public void add() {
        assertEquals(9, cal.add(6,3));
        System.out.println("add");
    }

    @Test
    public void subtract() {
        assertEquals(3, cal.subtract(6,3));
        System.out.println("subtract");
    }

    @AfterEach
    public void teardown() {
        System.out.println("teardown");
    }
}

/*
실행결과
before
subtract
teardown (after)
before
add
teardown (after)
 */


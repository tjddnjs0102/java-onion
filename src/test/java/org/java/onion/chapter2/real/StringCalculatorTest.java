package org.java.onion.chapter2.real;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    private StringCalculator cal;

    @BeforeEach
    public void setup() {
        cal = new StringCalculator();
    }

    @Test
    public void add1() {
        assertEquals(0, cal.add(null));
        assertEquals(0, cal.add(""));
    }

    @Test
    public void add2() throws Exception {
        assertEquals(1, cal.add("1"));
    }

    @Test
    public void add3() throws Exception {
        assertEquals(3, cal.add("1,2"));
    }

}
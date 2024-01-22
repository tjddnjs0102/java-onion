package org.java.onion.chapter2.testandrefactor;




import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/*
assertEquals(기대값, 결과값);
 */
public class CalculatorTestV4 {
    @Test
    public void add() {
        CalculatorV2 cal = new CalculatorV2();
        assertEquals(9, cal.add(6,3));
    }

    @Test
    public void subtract() {
        CalculatorV2 cal = new CalculatorV2();
        assertEquals(3, cal.subtract(6,3));
    }
}

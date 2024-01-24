package org.java.onion.chapter2.practice;




import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// CalculatorV2 인스턴스 생성하는 부분 중복을 제거
public class CalculatorV5Test {
    private CalculatorV2 cal = new CalculatorV2();

    @Test
    public void add() {
        assertEquals(9, cal.add(6,3));
    }

    @Test
    public void subtract() {
        assertEquals(3, cal.subtract(6,3));
    }
}

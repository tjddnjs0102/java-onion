package org.java.onion.chapter2.testandrefactor;


import org.junit.jupiter.api.Test;

/*
JUnit은 @TEST 어노테이션을 사용해 각각의 테스트 메소드를 독립적으로 실행할 수 있다.
 */
public class CalculatorV3Test {
    @Test
    public void add() {
        CalculatorV2 cal = new CalculatorV2();
        System.out.println(cal.add(6,3));
    }

    @Test
    public void subtract() {
        CalculatorV2 cal = new CalculatorV2();
        System.out.println(cal.subtract(6,3));
    }
}

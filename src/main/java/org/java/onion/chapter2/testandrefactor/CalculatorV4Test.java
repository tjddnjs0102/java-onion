package org.java.onion.chapter2.testandrefactor;




import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/*
assertEquals(기대값, 결과값);
 */
public class CalculatorV4Test {
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


// 테스트를 진행하면서 junit가 존재하지 않는다는 에러를 만나면
// Settings > Build, Excution, Deployment > Build Tools > Gradle에서
// Build and run using과 Run tests using을 모두 IntelliJ IDEA로 바꿔준다! (Gradle로 되어있었음.. )
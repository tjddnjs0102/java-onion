package org.java.onion.chapter2.practice;




import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/*
assertEquals(기대값, 결과값);
값이 일치하는 경우 초록창이 뜨면서 넘어가지만,
일치하지 않는 경우 기대치와 실제 값을 나타내어 테스트 결과를 알려준다.
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
// Build and run using과 Run tests using을 모두 IntelliJ IDEA로 바꿔준다! (Gradle로 되어있었다.)

/*
JUnit의 Assert 클래스에 있는 메서드들..
- assertEquals()
- assertTrue()
- assertFalse()
- assertNull()
- assertNotNull()
- assertArrayEquals()
 */
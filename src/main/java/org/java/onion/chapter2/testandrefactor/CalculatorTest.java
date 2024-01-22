package org.java.onion.chapter2.testandrefactor;

/*
테스트 코드를 담당하는 별도의 클래스를 추가했으나,
main()메서드 하나에 프로덕션 코드의 여러 메소드를 동시에 테스트함.
이는 복잡도도 높아지고 유지하기에 부담이 있다.
 */
public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorV2 cal = new CalculatorV2();
        System.out.println(cal.add(3,4));
        System.out.println(cal.subtract(5,4));
        System.out.println(cal.multiply(2,6));
        System.out.println(cal.divide(8,4));
    }
}

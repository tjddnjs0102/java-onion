package org.java.onion.chapter2.testandrefactor;

/*
테스트 코드를 각 메소드 별로 분리하였다.
그러나 계산기 클래스가 가지고 있는 모든 메소드를 테스트할 수밖에 없다.
또한 테스트 결과를 매번 콘솔에 출력되는 값을 통해 수동으로 확인해야 한다는 것이다.

JUnit은 내가 관심 가지는 메소드에 대한 테스트만 가능하다.
그리고 로직을 실행한 후의 결과 값 확인을 프로그래밍을 통해 자동화하는 것이 가능하다.
다음 버전에서는 JUnit을 사용한다.
 */
public class CalculatorTestV2 {
    public static void main(String[] args) {
        CalculatorV2 cal = new CalculatorV2();
        add(cal);
        subtract(cal);
        multiply(cal);
        divide(cal);
    }

    private static void divide(CalculatorV2 cal) {
        System.out.println(cal.divide(9,3));
    }
    private static void multiply(CalculatorV2 cal) {
        System.out.println(cal.divide(9,3));
    }
    private static void subtract(CalculatorV2 cal) {
        System.out.println(cal.divide(9,3));
    }
    private static void add(CalculatorV2 cal) {
        System.out.println(cal.divide(9,3));
    }

}

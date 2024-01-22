package org.java.onion.chapter2.testandrefactor;

/*
서비스를 담당하는 프로덕션 코드와 테스트 코드(main())가 같은 클래스에 있어서 문제이다.
테스트 코드는 테스트 단계에서만 필요하기 때문에 서비스 시점에 같이 배포될 필요가 없다.
 */

public class CalculatorV1 {
    int add(int i, int j) {
        return i + j;
    }

    int subtract(int i, int j) {
        return i - j;
    }

    int multiply(int i, int j) {
        return i * j;
    }

    int divide(int i, int j) {
        return i / j;
    }

    public static void main(String[] args) {
        CalculatorV1 cal = new CalculatorV1();
        System.out.println(cal.add(3,4));
        System.out.println(cal.subtract(5,4));
        System.out.println(cal.multiply(2,6));
        System.out.println(cal.divide(8,4));
    }
}

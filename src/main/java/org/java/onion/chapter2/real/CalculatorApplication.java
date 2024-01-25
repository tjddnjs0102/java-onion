package org.java.onion.chapter2.real;

import java.util.Scanner;

public class CalculatorApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringCalculator calculator = new StringCalculator();

        while (true) {
            System.out.println("쉼표(,) 혹은 클론(:)으로 구분된 값을 입력하시오. " +
                    "커스텀 구분자를 사용하려면 '//<구분자>|<숫자들>' 형식을 사용하세요. 예: '//;|1;2;3'");
            String input = scanner.nextLine();

            try {
                int result = calculator.add(input);
                System.out.println("합계: " + result);
                break;
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

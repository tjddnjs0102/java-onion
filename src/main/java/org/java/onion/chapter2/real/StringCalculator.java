package org.java.onion.chapter2.real;

import java.util.Scanner;

public class StringCalculator {
    int add(String text) {
        return 0;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("쉼표(,)로 구분된 값을 입력하시오.");
        String input = scanner.nextLine();
        StringCalculator calculator = new StringCalculator();

        int result = calculator.add(input);
        System.out.println("합계: " + result);
    }
}

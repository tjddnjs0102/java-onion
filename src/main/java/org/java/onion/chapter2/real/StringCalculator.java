package org.java.onion.chapter2.real;

import java.util.Scanner;

public class StringCalculator {
    int add(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        String[] numbers = splitNumbers(text);
        return sumNumbers(numbers);
    }

    private String[] splitNumbers(String text) {
        return text.split(",|:");
    }

    private int sumNumbers(String[] numbers) {
        int sum = 0;
        for (String number : numbers) {
            sum += parseAndValidateNumber(number);
        }
        return sum;
    }

    private int parseAndValidateNumber(String number) {
        int num;
        try {
            num = Integer.parseInt(number.trim());
        } catch (NumberFormatException e) {
            throw new RuntimeException("유효하지 않은 숫자입니다.");
        }

        if (num < 0) {
            throw new RuntimeException("음수는 입력할 수 없습니다.");
        }

        return num;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("쉼표(,) 혹은 클론(:)으로 구분된 값을 입력하시오.");
            String input = scanner.nextLine();
            StringCalculator calculator = new StringCalculator();
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
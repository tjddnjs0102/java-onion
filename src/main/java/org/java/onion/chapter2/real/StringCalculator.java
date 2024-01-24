package org.java.onion.chapter2.real;

import java.util.Scanner;

public class StringCalculator {
    int add(String text) {
        if (!text.contains(",")) {
            return -1;
        }

        String[] numbers = text.split(",");

        int sum = 0;
        for (String number : numbers) {
            int num;
            try {
                num = Integer.parseInt(number.trim());
            }catch (NumberFormatException e) {
                return -1;
            }
            if (num < 0) {
                throw new RuntimeException("음수는 입력할 수 없습니다.");
            }

            sum += num;
        }

        return sum;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("쉼표(,)로 구분된 값을 입력하시오.");
            String input = scanner.nextLine();
            StringCalculator calculator = new StringCalculator();
            int result = calculator.add(input);

            if (result == -1) {
                System.out.println("오류: 입력은 쉼표로 구분되어야 합니다. 다시 시도해주세요.");
                continue;
            }

            System.out.println("합계: " + result);
            break;

        }
    }
}

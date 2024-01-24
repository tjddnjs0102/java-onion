package org.java.onion.chapter2.real;

import java.util.Scanner;

public class StringCalculator {
    // 요구사항: 전달하는 문자를 구분자로 분리한 후 각 숫자의 합을 구해 반환한다.
    int add(String text) {

        if (text == null || text.isEmpty()) {
            return 0;
        }


        if (!text.matches(".*[,|:].*")) {
            return -2;
        }

        String[] numbers = text.split(",|:");

        int sum = 0;
        for (String number : numbers) {
            int num;
            try {
                num = Integer.parseInt(number.trim());
            }catch (NumberFormatException e) {
                return -1;
            }
            if (num < 0) { // 요구사항: 음수를 입력하는 경우 RuntimeException을 발생시킨다.
                throw new RuntimeException("음수는 입력할 수 없습니다.");
            }

            sum += num;
        }

        return sum;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("쉼표(,) 혹은 클론(:)으로 구분된 값을 입력하시오.");
            String input = scanner.nextLine();
            StringCalculator calculator = new StringCalculator();
            int result = calculator.add(input);

            if (result == -2) {
                System.out.println("오류: 입력은 쉼표 혹은 클론으로 구분되어야 합니다. 다시 시도해주세요.");
                continue;
            }

            System.out.println("합계: " + result);
            break;

        }
    }
}

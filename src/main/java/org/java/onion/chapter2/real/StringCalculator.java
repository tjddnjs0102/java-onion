package org.java.onion.chapter2.real;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    private static final Pattern CUSTOM_DELIMITER_PATTERN = Pattern.compile("//(.+)\n(.*)");

    // 누군가 add 메서드를 봤을 때 어떤 역할인지 알기 쉽도록 만들기
    int add(String text) {
        if (isBlank(text)) {
            return 0;
        }

        String[] numbers = splitNumbers(text);
        return sumNumbers(numbers);
    }


    private boolean isBlank(String text) {
        return text == null || text.isEmpty();
    }

    private String[] splitNumbers(String text) {
        Matcher matcher = CUSTOM_DELIMITER_PATTERN.matcher(text);
        if (matcher.matches()) {
            String delimiter = Pattern.quote(matcher.group(1));
            return matcher.group(2).split(delimiter);
        }
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
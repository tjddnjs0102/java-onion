package org.java.onion.chapter2.testandrefactor;

// V2에서는 테스트 코드를 분리시켰다.

public class CalculatorV2 {
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
}

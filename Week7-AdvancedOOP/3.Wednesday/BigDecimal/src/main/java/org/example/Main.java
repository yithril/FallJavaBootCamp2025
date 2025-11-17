package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal firstNumber = new BigDecimal(".1");
        BigDecimal secondNumber = BigDecimal.valueOf(.2);

        //You CANNOT use + - / * with big decimal because they are OBJECTS
        var sum = firstNumber.add(secondNumber);
        System.out.println(sum);

        var product = firstNumber.multiply(secondNumber);
        var quotient = firstNumber.divide(secondNumber);
        var difference = firstNumber.subtract(secondNumber);
    }
}
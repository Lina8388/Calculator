package com.company;

public class CalcArab {
    public static int calc (int num1, int num2, String operator) throws Exception {

        int result;
        if ((num1 > 10) || (num1 < 1) || (num2 > 10) || (num2 < 1) ) throw new Exception("Числа должны быть от 1 до 10");

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                 throw new Exception("Используйте только +, -, *, /");}
        return result;
    }
}
